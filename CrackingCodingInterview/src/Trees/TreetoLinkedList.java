/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;


import java.util.ArrayList;

/**
 *
 * @author Deep
 */
public class TreetoLinkedList
{
    ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args)
    {
        tree root=new tree(1);
	root.left=new tree(2);
	root.right=new tree(3);
	root.left.left=new tree(4);
	root.left.right=new tree(5);
	root.right.left=new tree(6);
	root.right.right=new tree(7);
        Link x = new Link(1);
      Link z=  treeLinkedList(root,x);
      while(z!=null)
      {
       System.out.format("%d ", z.value);  
            z = z.next;   
      }
        System.out.println();
    }
    
    
    public static Link treeLinkedList(tree root,Link x)
    {
        if( root!=null)
        {
            treeLinkedList(root.left,x);
            
            x.appendtoTail(root.value);
            treeLinkedList(root.right,x);
        }
        return x;
        
    }
    
}
class Link
{
    Link next;
    int value;
    Link(int d)
    {
        value=d;
        next=null;
    }
    void appendtoTail(int d)
    {
       Link end = new Link(d);
       Link n = this;
       while(n.next!=null)
       {
           n=n.next;
       }
       n.next=end;
       
       
    }
}
class tree
{
    tree left;
    tree right;
    int value;
    tree(int d)
    {
        value =d;
        right=left=null;
    }
}