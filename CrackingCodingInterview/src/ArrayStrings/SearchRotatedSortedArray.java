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
public class SearchRotatedSortedArray
{
	public static void main(String args[])
	{
		int num[] = {4,5,6,7,0,1,2};
		System.out.println(search(num,0,num.length-1,7));
	}
	public static int search(int[] num,int left,int right,int target)
	{
		if(left > right)
			return -1;
		
		int mid=left+(right-left)/2;
			
		if(target==num[mid])
			return mid;
		if(num[left]<=num[mid])
		{
			if(num[left] <= target && target < num[mid])
			{
				return search(num,left,mid-1,target);
			}
			else
			{
				return search(num,mid+1,right,target);
			}
			
		}
		else
		{
			if(num[mid] < target && target <= num[right])
				return search(num,mid+1,right,target);
			else
			{
				return search(num,left,mid-1,target);
			}
		}
		
		
				
		
		
	}
}

