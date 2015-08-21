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
public class ReversePolishNotation
{
	public static void main(String args[])
	{
		String[] tokens = new String[] { "2", "2", "+", "3", "*" };
		System.out.println(evalRPN(tokens));
	}
	
	public static int evalRPN(String[] tokens) {
		int returnValue = 0;
		String operators = "+-*/";
 
		Stack<String> stack = new Stack<String>();
 
		for (String t : tokens) {
			if (!operators.contains(t)) { //push to stack if it is a number
				stack.push(t);
			} else {//pop numbers from stack if it is an operator
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				switch (t) {
				case "+":
					stack.push(String.valueOf(a + b));
					break;
				case "-":
					stack.push(String.valueOf(b - a));
					break;
				case "*":
					stack.push(String.valueOf(a * b));
					break;
				case "/":
					stack.push(String.valueOf(b / a));
					break;
				}
			}
		}
 
		returnValue = Integer.valueOf(stack.pop());
 
		return returnValue;
	}
}
