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
public class UniqueCharacters
{
		public static void main(String args[])
		{
			System.out.println(isUnique("deep"));
		}
		
		public static boolean isUnique(String a)
		{
			if(a.length() > 128)
				return false;
			
			boolean[] b= new boolean[128];
			
			for(int i=0;i<a.length();i++)
			{
				int c=a.charAt(i);
				if(b[c])
				{
					return false;
				}
				b[c]= true;
			}
				
			return true;
		}
}

