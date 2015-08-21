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
public class RotateArray
{

	public static void main(String[] args)
	{
		int a[]={1,2,3,4,5};
		rotate(a,3);

	}
	public static void rotate(int[] num,int l)
	{
		int result[]=new int[num.length];
		
		for(int i=0;i<l;i++)
			result[i]=num[num.length-l+i];
		int j=0;
		for(int i=l;i<num.length;i++)
			result[i]=num[j];
			j++;
			
	System.arraycopy(result, 0, num, 0, num.length);
	
	for(int i=0;i<num.length;i++)
	{
		System.out.println(num[i]);
	}
			
			
	}

}

