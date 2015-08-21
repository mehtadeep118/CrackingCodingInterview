/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author deep
 */
public class PermutePalindrome 
{
	public static void main(String args[])
	{
		int count=0;
		HashMap <Character,Integer> s= new HashMap <Character,Integer> ();
		s=count("tactcoapapa");
		
		for(Map.Entry<Character, Integer> entry:s.entrySet())
		{
			
			int val=entry.getValue();
			int x = val % 2;
			
			if(x == 1)
			{
				count++;
			}
		}
		
		if(count==1)
		{
			System.out.println("pal");
			
		}
		
		else
		{
			System.out.println("not");
		}
		
		
	}
	public static boolean permutePalindrom(String s)
	{
		
		return true;
	}
	
	public static HashMap <Character, Integer> count(String d)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char h[]=d.toCharArray();
		
		for(int i=0;i<h.length;i++)
		{
			char inchar = d.charAt(i);
			if(map.containsKey(inchar))
			{
				map.put(inchar, map.get(inchar)+1);
			}
			else
			{
				map.put(inchar,1);
			}
		}
		/*
		Set<Character> keys = map.keySet();
		for(char x : keys)
		{
			System.out.println(map.get(x));
		}
		*/
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			char key=entry.getKey();
			int val=entry.getValue();
			System.out.println(key + " "+val);
		}
		return map;
	}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
}
