/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;


/**
 *
 * @author deep
 */
public class ArraytoBST 
{
    public static void main(String[] args)
    {
        int[] a={1,3,8,4,10,6};
        TreeNode z=sortedBST(a,0,a.length-1);
        while(z!=null)
        {
           
            
        }
    }
    
    public TreeNode sortedBST(int[] num) {
		if (num.length == 0)
			return null;
 
		return sortedBST(num, 0, num.length - 1);
	}
    
    public static TreeNode sortedBST(int[] data,int start,int end)
    {
        if(start > end)
            return null;
        
      int   mid = (start + end)/2;
      TreeNode root = new TreeNode(data[mid]);
      root.left=sortedBST(data,start,mid-1);
      root.right=sortedBST(data,mid+1,end);
      
      return root;
    }
}
