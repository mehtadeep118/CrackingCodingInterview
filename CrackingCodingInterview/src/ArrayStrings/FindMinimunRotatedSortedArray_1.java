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
public class FindMinimunRotatedSortedArray_1
{
	public static void main(String args[])
	{
		int a[]={4,5,6,7,0,1,2};
		System.out.println(findMin(a,0,a.length-1));
	}
	
	public static  int findMin(int[] num,int left,int right)
	{
		
		if(left==right)
			return num[left];
		if((right-left)==1)
			return Math.min(num[left], num[right]);
		int middle=left + (right-left)/2;
		
		if(num[left] < num[right])
		{
			return num[left];
		}
		else if(num[middle]> num[left])
		{
			return findMin(num,middle,right);
		}
		else
		{
			return findMin(num,left,middle);
		}
	}

}
