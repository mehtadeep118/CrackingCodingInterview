/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Deep
 */
public class ValidateBST 
{ArrayList <Integer>  list = new ArrayList<Integer>();
    public static void main(String[] args)
    {
        ArrayList<Integer> b = new ArrayList<Integer>();
        
        TreeNode root=new TreeNode(4);
	root.left=new TreeNode(2);
	root.right=new TreeNode(5);
	root.left.left=new TreeNode(1);
	root.left.right=new TreeNode(3);
        ValidateBST a1 = new ValidateBST();
        Integer[] l1=a1.validTree(root);
        System.out.println(a1.isAscending(l1));
        System.out.println(Arrays.toString(l1));
        
    }
    
    public  Integer[] validTree(TreeNode root)
    {
        
        if(root!=null)
        {
           validcheck(root);
        }
        
        Integer[] s = list.toArray(new Integer[list.size()]);
        return s;
        
    }
    public void validcheck(TreeNode root)
    {
        if(root!=null)
        {
             validcheck(root.left);
            list.add(root.value);
            validcheck(root.right);
        }
    }
    public boolean isAscending(Integer[] y)
    {
        for(int i=0;i < y.length-1;i++)
        {
            if(y[i+1] < y[i])
            {
               return false; 
            }
        }
        return true;
    }
}
