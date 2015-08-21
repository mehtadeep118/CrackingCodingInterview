/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

/**
 *
 * @author deep
 */
public class RotateString 
{
    public static void main(String args[])
    {
        System.out.println(checkRotation("waterbottle","erbottlewat"));
    }
    public static boolean isSubstring(String a, String b)
    {
        if(a.contains(b))
        return true;
        
       else
            return false;
    }
    public static boolean checkRotation(String s1,String s2)
    {
        int len=s1.length();
        
        if(len==s2.length() && len > 0)
        {
            String s3=s1+s1;
            
            return isSubstring(s3,s2);
        }
        return false;
        
    }
    
}
