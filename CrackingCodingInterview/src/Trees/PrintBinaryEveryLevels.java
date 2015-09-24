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
 * @author Deep
 * Print levels of all Binary Tree
 */
public class PrintBinaryEveryLevels
{
    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(40);
		root.left=new TreeNode(20);
		root.left.left=new TreeNode(10);
		root.left.right=new TreeNode(30);
		root.right=new TreeNode(60);
		root.right.left=new TreeNode(50);
		root.right.right=new TreeNode(70);
                printLevels(root);
    }
    public static void printLevels(TreeNode root)
    {
        if(root==null)
            return;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int level=0;
        q.add(root);
        while(!q.isEmpty())
        {
            level=q.size();
            while(level>0)
            {
            root=q.poll();
            System.out.print(root.value);
            if(root.left!=null)
                q.add(root.left);
            if(root.right!=null)
                q.add(root.right);
            level--;
            }
            System.out.print("\n");
            
        }
            
    }
    
}
