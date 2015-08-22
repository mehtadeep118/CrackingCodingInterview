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
public class LinkedList 
{
    public static void main(String[] args)
    {
        /*
        Node x = new Node(1);
        x.appendtoTail(2);
        x.appendtoTail(3);
        x.appendtoTail(4);
        printLinkedList(x);
        */
        
        Node x = new Node(1);
        x.next=new Node(2);
        x.next.next=new Node(3);
        x.next.next.next=new Node(10);
        printLinkedList(x);
    }
    
    public static void printLinkedList(Node head)
    {
     while(head!=null)
     {
         System.out.format("%d ", head.val);  
            head = head.next; 
     }
     System.out.println();
    }
}
