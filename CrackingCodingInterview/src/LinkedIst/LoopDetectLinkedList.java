/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedIst;

/**
 *
 * @author deep
 */
public class LoopDetectLinkedList 
{
    public static void main(String[] args)
    {
        Node x = new Node(1);
        x.next=new Node(2);
        x.next.next=new Node(4);
        x.next.next.next=new Node(6);
        x.next.next.next.next=new Node(8);
        x.next.next.next.next.next=new Node(10);
        x.next.next.next.next.next.next=new Node(12);
        System.out.println(cycle(x));
    }
    
    public static boolean cycle(Node head)
    {
        Node fast=head;
        Node slow=head;
        
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow)
                return true;
        }
        return false;
    }
    
}
