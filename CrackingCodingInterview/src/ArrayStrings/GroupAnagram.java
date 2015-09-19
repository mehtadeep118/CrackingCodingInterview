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
 * @author deep
 */
public class GroupAnagram
{
	public static void main(String args[])
	{
		
		String[] arrwords = {"art","tar","top","pot","neat","rat","tape","nate","peat","random"};
		String[] words=sort(arrwords);
		HashMap<String,String> map=new HashMap<String,String>();
	}
	public static String[] sort(String[] s)
	{	int i=0;
		String a[]=new String[s.length];
		
		for(String b:s )
		{
			a[i++]=b;
			
		}
		i=0;
		for(String d:a)
		{
			char[] h=d.toCharArray();
			Arrays.sort(h);
			d=new String(h);
			a[i++]=d;
		}
		return a;
		
		
	}
}

