/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

/**
 *
 * @author Deep
 */
public class TryKthElement 
{
    public static void main(String args[])
    {
        Integer[] a={6,3,2,1,13};
        kthElement(a,2);
    }
    
    public static void kthElement(Integer[] x,int b)
    {
        
        HashSet<Integer> a = new HashSet<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();
     
        a.addAll(Arrays.asList(x));
        System.out.println(a);
        
    }
}
