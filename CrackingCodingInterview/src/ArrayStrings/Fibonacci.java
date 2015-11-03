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
public class Fibonacci {
    public static void main(String[] args)
    {
        System.out.println(fiboRecursive(7));
        //System.out.println(fibo(7));
        System.out.println(fibo(7));
    }
    public static int fiboRecursive(int x)
    {
        if(x==0 || x==1)
            return x;
        else
            return fiboRecursive(x-1)+fiboRecursive(x-2);
    }
    
   public static int fibo(int n)
   {
           if (n < 0) {
            return -1;
        }
 
        if (n == 0) {
            return 1;
        }
 
        int a = 1;
        int b = 1;
 
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
 
        return b;
    }
 
   }

