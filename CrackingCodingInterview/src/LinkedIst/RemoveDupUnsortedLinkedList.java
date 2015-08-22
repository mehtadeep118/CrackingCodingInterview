/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedIst;

import java.util.HashSet;

/**
 *
 * @author deep
 */
public class RemoveDupUnsortedLinkedList
{
    public static void main(String args[])
    {
        HashSet <Integer> ans = new HashSet<Integer>();
        Node x = new Node(1);
        x.next=new Node(9);
        x.next.next=new Node(2);
        x.next.next.next=new Node(12);
        x.next.next.next.next=new Node(2);
        ans =removeDuplicates(x);
        for(int i : ans)
        {
            System.out.println(i);
        }
        
    }
    
    
    public static HashSet<Integer>  removeDuplicates(Node x)
    {
        HashSet <Integer> set = new HashSet <Integer> ();
        Node previous = null;
        
        while(x!=null)
        {
            if(set.contains(x.val))
            {
                previous.next=x.next;
            }
            else
            {
                set.add(x.val);
                previous = x;
            }
            x=x.next;
        }
        return set;
      
    }
    
}
