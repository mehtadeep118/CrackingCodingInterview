/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Deep
 */
public class PairOfSumstoK 
{
    public static void main(String[] args)
    {
        int[] a ={1,2,4,3,5};
        int[] b;
        b=sum(a,6);
        for(int i=0;i<b.length;i++)
        {
            System.out.println(i);
        }
        
    }
    
    
    public static int[] sum(int[] x,int k)
    {int b[];
        
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       for(int i=0;i<x.length;i++)
       {
           map.put(i, k-x[i]);
           
       }
       for(int i=0;i<x.length;i++)
       {
           if(map.containsKey(k-x[i]))
           {
               return new int[]{i+1,map.get(k-x[i]+1)};
           }
           
       }
        
       
     return new int[2];  
    }
}
