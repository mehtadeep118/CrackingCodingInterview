/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author deep
 */
public class BinarryToArray 
{
	int[] arr;
	ArrayList<Integer> x1 = new ArrayList<Integer>();
	
	
	public static void main(String args[])
	{
		
		
		TreeNode root=new TreeNode(40);
		root.left=new TreeNode(20);
		root.left.left=new TreeNode(10);
		root.left.right=new TreeNode(30);
		root.right=new TreeNode(60);
		root.right.left=new TreeNode(50);
		root.right.right=new TreeNode(70);
		
		//inOrder(root);
		System.out.println(inOrderiter(root));
		
		BinarryToArray x2 = new BinarryToArray();
		int y[]=x2.inOrderRecursiveN(root);
		Arrays.sort(y);
		
		for(int k=0; k < y.length ;k++ )
		{
			System.out.println(y[k]);
		}
		
	}
	
	public static void inOrder(TreeNode root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.println(root.value);
			inOrder(root.right);
		}
	}
	
	
	public  int[] inOrderRecursiveN(TreeNode root)
	{
		if(root!=null)
		{
			helper(root);
		}
		
		return listoArray(x1);
		
	}
	
	public  void helper(TreeNode x)
	{
		if(x.left!=null)
			helper(x.left);
		
		x1.add(x.value);
		
		if(x.right!=null)
			helper(x.right);
		
		
	}
	
	public static int[] listoArray(ArrayList<Integer> i)
	{
		int x[] = new int[i.size()];
		Iterator<Integer> iterator = i.iterator();
		for(int j=0;j < x.length;j++)
		{
			x[j]=iterator.next().intValue();
			
		}
		return x;
		
	}
	
	public static ArrayList<Integer> inOrderiter(TreeNode root)
	{
		ArrayList<Integer> lst = new ArrayList<Integer>();
		TreeNode z=root;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while(!stack.empty() || z !=null )
		{
			if(z != null)
			{
				stack.push(z);
				z=z.left;
			}
			else
			{
				TreeNode t =stack.pop();
				lst.add(t.value);
				z=t.right;
			}
		}
		return lst;
	}
	}

class TreeNode
{
	int value;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x)
	{
		value=x;
		left=right=null;
	}
}
