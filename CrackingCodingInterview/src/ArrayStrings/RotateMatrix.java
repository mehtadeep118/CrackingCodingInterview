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
 * cracking coding question 1.7 (6 Edition)
 * it use this relation for rotating matrix[i][j]=matrix[n-1-j][i]
 */
public class RotateMatrix
{
    public static void main(String args[])
    {
        int marks[][]={{50,60,55,67,70},{62,65,70,70,81},{72,66,77,80,69}};
        System.out.println(Arrays.deepToString(rotate(marks,3)));
        int multi[][] = rotate(marks,3);
        for(int j=0;j<3;j++)
        {
            for(int k = 0; k < 5 ; k++)
            {
                System.out.println(multi[j][k]+"");
            }
            System.out.println(" ");
            
        }
        
        
    }
    
    public static int[][] rotate(int[][] matrix,int n)
    {
        int v = matrix.length;
        for (int i = 0; i < n / 2; i++) {
		for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
			int temp = matrix[i][j];
			matrix[i][j] = matrix[n-1-j][i];
			matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
			matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
			matrix[j][n-1-i] = temp;
		}
	}
        return matrix;
    }
}
