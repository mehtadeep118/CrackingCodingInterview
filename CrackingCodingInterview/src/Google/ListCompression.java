/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.ArrayList;

/**
 *
 * @author Deep
 */
public class ListCompression
{
    public static void main(String[] args)
    {
       int[] d={1,2,3,5,10,11};
       compress(d);
    }
    public static void compress(int[] arr)
    {
        int arrLen = arr.length;

        int start = 0;
        int end = 0;
        while (end < arrLen) {

            if (!(end == arrLen - 1) && (arr[end] + 1 == arr[end + 1])) {
                end++;
            } else {
                if (start != end) {
                    System.out.print(arr[start] + " - " + arr[end] + " ,");
                } else {
                    System.out.print(arr[start] + " ,");
                }
                start = end;
                start++;
                end++;
                
            }
        }
    }
}

    

