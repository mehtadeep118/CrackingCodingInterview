/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

import java.util.Stack;

/**
 *
 * @author deep
 */
public class ReversePolish
{
			public static void main(String args[])
			{
				String a[]={"2","1","+","3","*"};
				System.out.println(polish(a));
			}
			
			public static int polish(String[] c)
			{
				int result=0;
				String operators="+-*/";
				Stack <String> d= new Stack<String>();
				for(String t:c)
				{
					if(!operators.contains(t))
					{
						d.push(t);
					}
					else
					{
						int a=Integer.valueOf(d.pop());
						int b=Integer.valueOf(d.pop());
						
						switch(t)
						{
						case "+" :
							d.push(String.valueOf(a+b));
							break;
						case "-":
							d.push(String.valueOf(a-b));
							break;
						case "*" :
							d.push(String.valueOf(a*b));
							break;
						case "/" :
							d.push(String.valueOf(b/a));
							break;
						
						}
					}
				}
				
				result=Integer.valueOf(d.pop());
				
				return result;
			}
}

