/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Deep
 */
public class GroupAnagrams 
{
    public static void main(String args[])
    {
     HashMap<String,String> map = new HashMap<String,String>();
     int i=0;
     String[] a={"dog","god","cat","act"};
     String[] b={"dog","god","cat","act"};
    String[] c= greoupAnagram(b);
    
     for(String s:c)
     {
         //System.out.println(s);
         if(map.containsKey(s))
         {
             map.put(s, map.get(s)+","+a[i++]);
             System.out.println(map.get(s));
         }
         else
         {
             map.put(s, a[i++]);
         }
     }
    }
    public static String[] greoupAnagram(String[] a)
    {int i=0;
        for(String s:a)
        {
            
           char[] temp= s.toCharArray();
            Arrays.sort(temp);
            s=new String(temp);
            a[i++]=s;
            //Arrays.sort(a);
        }
        
 
        return a;
       
        
    }
}
