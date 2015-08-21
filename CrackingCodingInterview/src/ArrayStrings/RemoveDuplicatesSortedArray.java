/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

import java.util.Arrays;

/**
 *
 * @author deep
 */
public class RemoveDuplicatesSortedArray 
{
	public static int[] removeDuplicates(int[] A) {
		if (A.length < 2)
			return A;
	 
		int j = 0;
		int i = 1;
	 
		while (i < A.length) {
			if (A[i] == A[j]) {
				i++;
			} else {
				j++;
				A[j] = A[i];
				i++;
			}
		}
	 
		int[] B = Arrays.copyOf(A, j + 1);
	 
		return B;
	}
	 
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3 };
		arr = removeDuplicates(arr);
		System.out.println(arr.length);
	}

}

