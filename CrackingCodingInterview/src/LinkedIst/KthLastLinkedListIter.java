/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedIst;
import java.util.LinkedList;

/**
 *
 * @author deep
 * Here first approach is very simple using java inbuilt LInkedList class another is iterative
 * approach
 * I am going for easy find length of LinkedList and subtract k from that add 1 and done
 */
public class KthLastLinkedListIter
{
    public static void main(String args[])
    {
        Node x = new Node(1);
        x.next=new Node(9);
        x.next.next=new Node(2);
        x.next.next.next=new Node(12);
        x.next.next.next.next=new Node(2);
        x.next.next.next.next.next=new Node(8);
        x.next.next.next.next.next.next=new Node(9);
       LinkedList<Integer> a = new LinkedList<Integer>();
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(2);
        //System.out.println(searchKlast(a,3));
        Node y = searchKthIter(x,3);
        System.out.println(y.val);
        
        
        
        
    }
    public static int searchKlast(LinkedList d,int k)
    {
        
        int l=d.size()-k;
        return l;
    }
    
    public static Node searchKthIter(Node x,int k)
    {
        Node p1=x;
        Node p2=x;
        
        for(int i=0;i<k;i++)
        {
            p1=p1.next;
        }
        while(p1!=null)
        {
            p1=p1.next;
            p2=p2.next;
        }
        
        return p2;
        
    }
}
