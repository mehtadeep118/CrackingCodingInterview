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
class NumberOccurance
{
	public static void main(String[]args)
	{
		
		int a[]={1,2,2,2,2,2,3,3,3,3,6,8,9};
		System.out.println(occurance(a,2,0,a.length-1));
	}
	
	public static int occurance(int num[],int k,int start,int end)
	{
		if(end < start)
		return 0;
		
		if(num[start]==k && num[end]==k)
			return end-start+1;
		int mid=(start+end)/2;
		
		if(num[mid]==k)
			return 1+occurance(num,k,start,mid-1) + occurance(num,k,mid+1,end);
		else if(num[mid]>k)
			return occurance(num,k,start,mid-1);
		else
			return occurance(num,k,mid+1,end);
		}
}
