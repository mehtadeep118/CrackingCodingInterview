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
public class NumberOccurence1 
{
	public static void main(String args[])
	{
		int a[]={1,2,2,2,2,2,2,3,3,3,4};
		System.out.println(occurence(a,2,0,a.length-1));
		
	}
	
	public static int occurence(int num[],int k,int start,int end)
	{
		if(end < start)
		return 0;
				
		
		int mid=(start+end)/2;
		if(num[start]==k && num[end]==k)
			return end-start+1;
		
		if(num[mid]==k)
			return 1+occurence(num,k,start,mid-1)+occurence(num,k,mid+1,end);
		else if(num[mid]>k)
			return occurence(num,k,start,mid-1);
		else
			return occurence(num,k,mid+1,end);
			
		
		
		
		
			
		
	}
}
