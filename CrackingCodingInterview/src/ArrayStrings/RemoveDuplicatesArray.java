/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author deep
 */
public class RemoveDuplicatesArray 
{
	public static void main(String args[])
	{
		int[] arrayWithDuplicates = {1,2,2,2,3,4,4,4,6,6,68,9,7,7};
		System.out.println(Arrays.toString(removeDuplicates(arrayWithDuplicates)));
	}
	
	public static Integer[] removeDuplicates(int a[])
	{
		String x;
		HashSet <Integer> map = new HashSet<>();
		
		for(int b:a)
		{
			map.add(b);
		}
		
		Integer[] finalArray =new Integer[map.size()];
                int i=0;
		for(int d:map)
                {
                    finalArray[i++]=d;
                }
            return finalArray;
		
	}
}

