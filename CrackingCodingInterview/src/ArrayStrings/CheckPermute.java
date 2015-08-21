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
import java.util.*;

public class CheckPermute 
{
	public static void main(String args[])
	{
		System.out.println(isPermute("dog","god1"));
	}
	public static boolean isPermute(String a, String b)
	{
		if(a.length()!=b.length())
			return false;
		char d[] = new char[a.length()-1];
		char e[] = new char[b.length()-1];
		
		d=a.toCharArray();
		e=b.toCharArray();
		
		Arrays.sort(d);
		Arrays.sort(e);
		
		String k = new String(d);
		String l = new String(e);
		
		
		if(k.equals(l))
			return true;
		
		else
			return false;
	}
	
	
	

}
