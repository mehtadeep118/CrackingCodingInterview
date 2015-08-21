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
 * 
 * write an algorithm such that if element in MxN matrix is 0 its entire row and column are set 
 * to zero
 * 
 */
public class setZeroMatrix 
{
    public static void main(String args[])
    {
        int multi[][]={{1,0,3,4},{1,2,3,4},{3,5,6,0}};
      System.out.println(Arrays.deepToString(zeroMatrix(multi)));
        
        //another way of print
        
        int ans[][]=zeroMatrix(multi);
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                System.out.println(ans[i][j]+" ");
            }
            System.out.println();
            
        }
        
        
    }
    
    public static int[][] zeroMatrix(int matrix[][])
    {
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];
        
        for(int i=0;i < matrix.length;i++)
        {
            for(int j=0;j < matrix[0].length;j++)
            {
                if(matrix[i][j]==1)
                {
                    row[i]=1;
                    column[j]=1;
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j < matrix[0].length;j++)
            {
                if(row[i]==1 || column[j]==1)
                {
                    matrix[i][j]=0;
                }
            }
        }
        
        return matrix;
    }
}
