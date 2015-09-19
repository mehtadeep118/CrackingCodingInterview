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
public class MiddleLinkedList
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
        middleElement(x);
    }
    public static void middleElement(Node head)
    {
        Node slow = head;
        Node fast = head;
        if(head!=null)
        {
            while(fast!=null && fast.next!=null )
            {
                fast=fast.next.next;
                slow=slow.next;
            }
            System.out.println(slow.val);
        }
        
    }
    
}
