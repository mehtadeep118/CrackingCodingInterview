/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author deep
 */
public class PrintBinaryTree 
{
	public static void main(String args[])
	{
		Tree root=new Tree(1);
		root.left=new Tree(2);
		root.right=new Tree(3);
		root.left.left=new Tree(4);
		root.left.right=new Tree(5);
		root.right.left=new Tree(6);
		root.right.right=new Tree(7);
		print(root,2);
		
		
	}
	
	public static void print1(Tree t,int currentlevel,int desire)
	{
		
	}
	public static void print(Tree t,int desire)
	{
		
		if(desire < 0) return;
		Queue<Tree> trees=new LinkedList<Tree>();
		Queue<Integer> levels=new LinkedList<Integer>();
		trees.add(t);
		levels.add(0);
		
		while(!trees.isEmpty())
		{
			Tree temp=trees.poll();
			int currentlevel=levels.poll();
			if(temp==null) return;
			else if(currentlevel==desire)
				System.out.println(temp.value);
			else
			{
				trees.add(temp.left);
				levels.add(currentlevel+1);
				trees.add(temp.right);
				levels.add(currentlevel+1);
				
			}
		}
		
		
	}
}

class Tree
{
	Tree left;
	Tree right;
	int value;
	Tree(int x)
	{
		value=x;
		left=right=null;
		
	}
	
}
