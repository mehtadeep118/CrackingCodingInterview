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