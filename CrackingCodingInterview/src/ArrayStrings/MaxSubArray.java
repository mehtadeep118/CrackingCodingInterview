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
public class MaxSubArray 
{
    public static void main(String[] args)
    {
        int[] x={2,1,3,4,1,2,1,5,4};
        System.out.println(maxArray(x));
    }
    public static int maxArray(int[] x)
    {
        int newSum=x[0];
        int max=x[0];
        for(int i=0;i<x.length;i++)
        {
          newSum=Math.max(newSum+x[i], x[i]);
          max=Math.max(max,newSum);
        }
        return max;
    }
    
}
