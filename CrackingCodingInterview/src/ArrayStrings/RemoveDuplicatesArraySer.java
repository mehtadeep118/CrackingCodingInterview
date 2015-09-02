/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

import java.util.HashSet;

/**
 *
 * @author Deep
 */
public class RemoveDuplicatesArraySer 
{
    public static void main(String[] args)
    {
        int[] x={1,1,2,2,3};
       int[] b=remove(x);
       
       for(int s:b)
       {
           System.out.println(s);
       }
       
       
       
        
        
    }
    
    public static int[] remove(int[] a)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int s:a)
        {
            set.add(s);
        }
        int[] arr =new int[set.size()];
        int index=0;
        for(Integer i:set)
        {
            arr[index++]=i;
        }
        
        return arr;
    }
}
