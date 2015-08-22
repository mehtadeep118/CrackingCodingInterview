/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedIst;

/**
 *
 * @author deep
 * Return k Last element in LinkedList Two approaches are used recursive and iterative
 */
public class KthElementLinkList 
{
    public static void main(String[] args)
    {
        Node x = new Node(1);
        x.next=new Node(2);
        x.next.next=new Node(4);
        x.next.next.next=new Node(6);
        x.next.next.next.next=new Node(8);
        kthLast(x,2);
    }
    public static int kthLast(Node x,int k)
    {
        if(x == null)
            return 0;
        
        int index = kthLast(x.next,k)+1;
        
        if(index ==k)
        {
            System.out.println(x.val);
        }
        return index;
    }
}
