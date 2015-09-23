/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedIst;

/**
 *
 * @author Deep
 */
public class ReverseLinkedList 
{
    public static void main(String args[])
    {
        Node x = new Node(1);
        x.next=new Node(2);
        x.next.next=new Node(3);
        x.next.next.next=new Node(10);
        Node z=Reverse(x);
        while(z != null)
        {
           
            System.out.format("%d", z.val);
             z=z.next;
        }
        System.out.println();
    }
   public static Node Reverse(Node head)
    {
        if(head==null || head.next == null)
        return head;
 
    //get second node    
    Node second = head.next;
    //set first's next to be null
   head.next = null;
 
    Node rest = Reverse(second);
    second.next = head;
 
    return rest;
            
    }
}
