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
       Solution();
       
    }
    public static void Solution()
    {
        long result1=0,result=0;
        int i,j;
        HashMap <HashMap<Integer,Integer>,Long> table = new HashMap<HashMap<Integer,Integer>,Long>();
        
        HashMap<Integer,Integer> f = new HashMap<Integer,Integer>();
        
        
        for(i =0;i<10;i++)
        {
            for( j=0;j<10;j++)
            {
                f.put(i, j);
                result1=(long) (Math.pow(i, 3)+Math.pow(j, 3));
                table.put(f, result1);
                
            }
        }
       
        for(int c =0;c<10;c++)
        {
            for(int d=0;d<10;d++)
            {
                result=(long) (Math.pow(c, 3)+Math.pow(d, 3));
                if(table.get(f)==result)
                {
                    System.out.println(c);
                    System.out.println(d);
                    System.out.println(f.entrySet().toString());
                }
                
                    
                
                
            }
        }
        
        
        
        
        
      
    }
}
