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
public class StringReverse 
{
		public static void main(String args[])
		{
			System.out.println(reverseRecursive("deep"));
			System.out.println(reverseIter("deep"));
		}
		
		public static String reverseRecursive(String d)
		{
			String s="";
			
			if(d.length()==1)
				return d;
			
			else
			{
				s=s+d.charAt(d.length()-1)+reverseRecursive(d.substring(0,d.length()-1));
				return s;
			}
			
		}
		
		public static String reverseIter(String str)
		{
			StringBuilder sb = new StringBuilder();
			
			char a[]=str.toCharArray();
			for(int i=str.length()-1;i>=0;i--)
			{
				sb.append(a[i]);
			}
			return sb.toString();
		}
}
