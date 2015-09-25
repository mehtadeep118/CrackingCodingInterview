/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedIst;

import java.util.Stack;

/**
 *
 * @author Deep
 */
public class PalindromeLinkedList 
{
    public static void main(String[] args)
    {
        Node x = new Node(1);
        x.next=new Node(2);
        x.next.next=new Node(3);
        x.next.next.next=new Node(10);
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(Node x)
    {
        Node fast=x;
        Node slow=x;
        
        Stack<Integer> stack = new Stack<Integer>();
        while(fast!=null && fast.next!=null)
        {
            stack.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        
        while(slow!=null)
        {
            int top=stack.pop().intValue();
            
            if(top!=slow.val)
            {
                return false;
            }
            slow=slow.next;
        }
        return true;
    }
    
}
