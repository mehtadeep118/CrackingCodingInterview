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
public class MedianTwoSorted
{
    public static void main(String[] args) 
    {
      int h[]={1,2,3,9};
      int j[]={4,5,10,11};
      System.out.println(findMedianSortedArrays(h,j));
     }
    public static double findMedianSortedArrays(int A[], int B[]) {
    	int m = A.length;
    	int n = B.length;
     
    	if ((m + n) % 2 != 0) // odd
    		return (double) findKth(A, B, (m + n) / 2, 0, m - 1, 0, n - 1);
    	else { // even
    		return (findKth(A, B, (m + n) / 2, 0, m - 1, 0, n - 1) 
    			+ findKth(A, B, (m + n) / 2 - 1, 0, m - 1, 0, n - 1)) * 0.5;
    	}
    }
     
    public static int findKth(int A[], int B[], int k, 
    	int aStart, int aEnd, int bStart, int bEnd) {
     
    	int aLen = aEnd - aStart + 1;
    	int bLen = bEnd - bStart + 1;
     
    	// Handle special cases
    	if (aLen == 0)
    		return B[bStart + k];
    	if (bLen == 0)
    		return A[aStart + k];
    	if (k == 0)
    		return A[aStart] < B[bStart] ? A[aStart] : B[bStart];
     
    	int aMid = aLen * k / (aLen + bLen); // a's middle count
    	int bMid = k - aMid - 1; // b's middle count
     
    	// make aMid and bMid to be array index
    	aMid = aMid + aStart;
    	bMid = bMid + bStart;
     
    	if (A[aMid] > B[bMid]) {
    		k = k - (bMid - bStart + 1);
    		aEnd = aMid;
    		bStart = bMid + 1;
    	} else {
    		k = k - (aMid - aStart + 1);
    		bEnd = bMid;
    		aStart = aMid + 1;
    	}
     
    	return findKth(A, B, k, aStart, aEnd, bStart, bEnd);
    }
}