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
public class Partition 
{
    public static void main(String[] args)
    {
        Node x = new Node(1);
        x.next=new Node(9);
        x.next.next=new Node(2);
        x.next.next.next=new Node(12);
        x.next.next.next.next=new Node(2);
        x.next.next.next.next.next=new Node(8);
        x.next.next.next.next.next.next=new Node(9);
        Node y=partitionNode(x,2);
        while(y!=null)
        {
            System.out.format("%d ", y.val);
            y=y.next;
            
        }
        System.out.println();
        
    }
    
    public static Node partitionNode(Node x,int y)
    {
        Node head=x;
        Node tail=x;
        
        while(x !=null)
        {
          Node d=x.next;
        if(x.val < y)
        {
            d.next=head;
            head=x;
        }
        else
        {
            tail.next=x;
            tail=x;
        }
        x=d;
        }
        tail.next=null;
        return head;
        
        }
       
    }

