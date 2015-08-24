/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author deep
 * 
 * x^3+y^3=a^3+b^3
 */
public class Equation 
{
    public static void main(String args[])
    {
       HashMap<Long,Long> a = new HashMap<Long,Long>(); 
       
       
    }
    public static HashMap<HashMap <Integer,Integer>,Long> Solution()
    {
        long result1=0,result=0;
        int i,j;
        HashMap <HashMap<Integer,Integer>,Long> table = new HashMap<HashMap<Integer,Integer>,Long>();
        
        HashMap<Integer,Integer> f = new HashMap<Integer,Integer>();
        
        
        for(i =0;i<1000;i++)
        {
            for( j=0;j<1000;j++)
            {
                f.put(i, j);
                result1=i^3+j^3;
                
                
            }
        }
        table.put(f, result1);
        for(int c =0;c<1000;c++)
        {
            for(int d=0;d<1000;d++)
            {
                result=c^3+d^3;
                
                
            }
        }
        
        
        return table;
        
        
        
      
    }
}
