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
public class ReplaceSpace 
{
		public static String replaceNewString(String a)
		{
			String b=a.replaceAll(" ", "%020");
			return b;
		}
		public static void main(String args[])
		{
		System.out.println(replaceNewString("yes h"));	
		}
}

