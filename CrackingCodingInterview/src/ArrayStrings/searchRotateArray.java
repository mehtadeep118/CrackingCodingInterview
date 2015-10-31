/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

/**
 *
 * @author Deep
 */
public class searchRotateArray {
    public static void main(String[] args)
    {
        int[] x={15,16,19,20,25,1,3,4,5,7,10,14};
        System.out.println(search(x,0,x.length-1,7));
    }
    public static int search(int[] x,int left,int right,int target)
    {
        if(left>right)
            return -1;
        int mid = (left+right)/2;
        
        if(x[mid]==target)
            return mid;
        
        if(x[left]<=x[mid])
        {
            if(x[left]<=target && target<x[mid]){
                return search(x,0,mid-1,target);
            }
            else{
                return search(x,mid+1,right,target);
            }
        }
        else
        {
            if(target <=x[right]&& target>x[mid]){
                return search(x,mid+1,right,target);
            }
            else{
                return search(x,0,mid-1,target);
            }
        }
}
}