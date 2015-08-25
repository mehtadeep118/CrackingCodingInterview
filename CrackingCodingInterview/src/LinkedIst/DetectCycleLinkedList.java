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
public class DetectCycleLinkedList
{
        public static void main(String args[])
        {
            Node x= new Node(1);
            x.appendtoTail(2);
            x.appendtoTail(3);
            x.appendtoTail(4);
            
            
            System.out.println(detectCycle(x));
        }
        public static boolean detectCycle(Node head)
        {
            Node fast=head;
            Node slow=head;
            
            while(fast !=null && slow!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
                
                if(slow==fast)
                    return true;
            }
            
            return false;
        }
                
}
