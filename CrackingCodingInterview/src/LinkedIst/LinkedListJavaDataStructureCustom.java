/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedIst;
import java.util.LinkedList;
import java.util.HashSet;
/**
 *
 * @author 
 * Remove duplicates in LinkedList using LinkedList data structure
 */
public class LinkedListJavaDataStructureCustom 
{
    public static void main(String args[])
    {
        LinkedList<Integer> a = new LinkedList<Integer>();
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(2);
        removeDuplicates(a);
    }
    public static void removeDuplicates(LinkedList b)
    {
        HashSet <Integer> s= new HashSet<Integer>();
        s.addAll(b);
        b.clear();
        b.addAll(s);
        System.out.println(b);
    }
}
