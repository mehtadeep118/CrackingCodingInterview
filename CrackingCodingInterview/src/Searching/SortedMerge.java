/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

/**
 *
 * @author deep
 */
public class SortedMerge 
{
   public static void merge(int[] a, int[] b, int lastA, int lastB) {
		int indexMerged = lastB + lastA - 1; /* Index of last location of merged array */
		int indexA = lastA - 1; /* Index of last element in array b */
		int indexB = lastB - 1; /* Index of last element in array a */
	
		/* Merge a and b, starting from the last element in each */
		while (indexB >= 0) {
			if (indexA >= 0 && a[indexA] > b[indexB]) { /* end of a is bigger than end of b */
				a[indexMerged] = a[indexA]; // copy element
				indexA--; 
			} else {
				a[indexMerged] = b[indexB]; // copy element
				indexB--;
			}
			indexMerged--; // move indices			
		}
	}
	
	public static void main(String[] args) {
		int[] a = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
		int[] b = {1, 4, 7, 6, 7, 7};
                
		merge(a, b, 8, 6);
	
	}

}
    

