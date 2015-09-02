/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

/**
 *
 * @author Deep
 */
public class SearchRotatedArray
{
    public static void main(String args[])
    {
        int[] x={15,16,19,20,25,1,3,4,5,7,10,14};
        System.out.println(binarySearch(x,0,x.length-1,7));
    }
    
    
    public static int binarySearch(int[] nums, int left, int right, int target){
    if(left>right) 
        return -1;
 
    int mid = left + (right-left)/2;
 
    if(target == nums[mid])
        return mid;
 
    if(nums[left] <= nums[mid]){
        if(nums[left]<=target && target<nums[mid]){
          return binarySearch(nums,left, mid-1, target);
        }else{
          return  binarySearch(nums, mid+1, right, target);
        }
    }else {
        if(nums[mid]<target&& target<=nums[right]){
          return  binarySearch(nums,mid+1, right, target);
        }else{
          return  binarySearch(nums, left, mid-1, target);
        }
    }
}
}