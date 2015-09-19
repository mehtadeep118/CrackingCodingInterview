/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

import java.util.Arrays;

/**
 *
 * @author Deep
 */
public class ReverseWords
{
    public static void main(String[] args)
    {
       System.out.println(reverse("this id dev man"));
    }
    public static String reverse(String a)
    {
        StringBuilder sb = new StringBuilder();
        String[] f=a.split(" ");
        for(int i=0;i<f.length;i++)
        {
         int x = f.length-1;   
         sb.append(f[x-i]).append(" ");
        }
        return sb.toString();
    }
}
