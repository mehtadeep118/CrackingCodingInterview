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
public class MergeTwoLists 
{
    public static void main(String[] args)
    {
        Node x = new Node(1);
        x.next=new Node(2);
        x.next.next=new Node(3);
        x.next.next.next=new Node(10);
        
        Node y = new Node(4);
        y.next=new Node(5);
        y.next.next=new Node(6);
        y.next.next.next=new Node(7);
       // Node s= merge(x,y);
        Node s1=mergeIterative(x,y);
       /*while(s!=null)
        {
            System.out.format("%d",s.val);
            s=s.next;
            
        }
               */
        System.out.println();
        while(s1!=null)
        {
            System.out.format("%d",s1.val);
            s1=s1.next;
            
        }
        System.out.println();
    }
    public static Node merge(Node l1,Node l2)
    {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        
        if(l1.val < l2.val)
        {
            l1.next=merge(l1.next,l2);
            return l1;
        }
        else
        {
            
            l2.next=merge(l1,l2.next);
            return l2;
        }
            
     
    }
    public static Node mergeIterative(Node l1, Node l2) {
 
        Node p1 = l1;
        Node p2 = l2;
 
        Node fakeHead = new Node(0);
        Node p = fakeHead;
 
        while(p1 != null && p2 != null){
          if(p1.val <= p2.val){
              p.next = p1;
              p1 = p1.next;
          }else{
              p.next = p2;
              p2 = p2.next;
          }
 
          p = p.next;
        }
 
        if(p1 != null)
            p.next = p1;
        if(p2 != null)
            p.next = p2;
 
        return fakeHead.next;
    }
}
