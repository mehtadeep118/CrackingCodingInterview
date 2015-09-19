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
public class SumLinkedLists
{static int x1,x2;

    public static void main(String[] args)
    {   
        Node x = new Node(7);
        x.next=new Node(1);
        x.next.next=new Node(6);
        Node y= new Node(5);
        y.next=new Node(9);
        y.next.next=new Node(2);
        SumLinkedLists z2 = new SumLinkedLists();
       Node f= z2.sum(x, y);
        while(f!=null)
        {
            if(f.val==0)
            {
                f.val=1;
            }
            System.out.format("%d ", f.val);
            f=f.next;
            
            
        }
        System.out.println();
        
        
        
    }
    public  Node sum(Node x,Node y)
    {  Node head = new Node(0); 
        Node s=head;
        int sum=0;
    
    while(x!=null || y!=null)
    {
        sum=0;
        sum=x.val+y.val;
        System.out.println(sum);
        x=x.next;
        y=y.next;
      
        s.next=new Node(sum%10);
        s=s.next;
        
    }
    
    
    return head.next;
       
    }
    
        
    }

