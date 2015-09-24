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
public class RemoveNthNodeFromEnd 
{
    public static void main(String[] args)
    {
        Node x = new Node(1);
        x.next=new Node(2);
        x.next.next=new Node(3);
        x.next.next.next=new Node(10);
        Node z=remove(x,2);
        System.out.print(z.val);
    }
    public static Node remove(Node x,int y)
    {
         Node fast=x;
        Node slow=x;
        
       
        
        for(int i=0;i<y;i++)
        {
            if(fast==null)
                return null;
            fast=fast.next;
        }
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    
}
