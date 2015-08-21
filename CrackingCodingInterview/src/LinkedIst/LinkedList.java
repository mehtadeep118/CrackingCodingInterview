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
        Node x = new Node(1);
        x.appendtoTail(2);
        x.appendtoTail(3);
        x.appendtoTail(4);
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
class Node
{
    Node next;
    int val;
    Node(int x)
    {
       val = x;
       next=null;
    }
    
    void appendtoTail(int d)
    {
       Node end = new Node(d);
       Node n = this;
       while(n.next!=null)
       {
           n=n.next;
       }
       n.next=end;
        
    }
    
    
}