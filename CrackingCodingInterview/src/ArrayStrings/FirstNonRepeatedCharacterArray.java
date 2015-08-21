/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

import java.util.HashMap;

/**
 *
 * @author deep
 */
public class FirstNonRepeatedCharacterArray 
{
		public static void main(String args[])
		{
			
			nonrepeated("stress");
		}
		public static void nonrepeated(String s)
		{
			HashMap <Character, Integer> a = new HashMap <Character,Integer> ();
			
			for(int i=0;i < s.length();i++)
			{
				char c=s.charAt(i);
				if(a.containsKey(c))
				{
					a.put(c, a.get(c)+1);
				}
				else
				{
					a.put(c,1);
				}
			}
			for(int i=0;i < s.length();i++)
			{
				char c=s.charAt(i);
				if(a.get(c)==1)
				{
					System.out.println(c);
					break;
				}
			}
		
		}
}

