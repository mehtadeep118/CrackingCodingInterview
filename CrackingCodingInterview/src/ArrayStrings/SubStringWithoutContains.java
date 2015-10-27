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
public class SubStringWithoutContains {
    
    public static void main(String[] args)
    {
        String c="abc";
        String d="abcabc";
        System.out.println(sub(c.toCharArray(),d.toCharArray(),c.length(),d.length()));
    }
    public static boolean sub(char[] a,char[] b,int m,int n)
    {
        if(m==0)
            return true;
        if(n==0)
            return false;
        if(a[m-1]==b[n-1])
            return sub(a,b,m-1,n-1);
        
        return sub(a,b,m,n-1);
        
    }  
}
