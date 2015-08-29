/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

/**
 *
 * @author Deep
 */
public class Permutation 
{
    
    public static void main(String args[])
    {
        permutation("aab","");
    }
    
   
   public static void permutation(String a,String prefix)
   {
       if(a.length()==0)
       {
           System.out.println(prefix);
       }
       else
       {
           for(int i=0;i < a.length();i++)
           {
               permutation(a+prefix.charAt(i),a.substring(0,i)+a.substring(i+1));
           }
       }
   }
}
