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
public class RotatedArray
{

	public static void main(String[] args)
	{
		int a[]={1,2,3,4,5,6};
		rotate(a,3);

	}
	public static void rotate(int[] num,int l)
	{
		
		int i,j;
		for(i=0;i<l;i++)
		{
			for(j=num.length-1;j>0;j--)
			{
				int temp;
				temp=num[j];
				num[j]=num[j-1];
				num[j-1]=temp;
				
				
			}
			
			
		}
		for(i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		
		
			
	}

}
