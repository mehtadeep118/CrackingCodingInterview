/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

/**
 *
 * @author Deep
 * Code Changes
 *
 */
public class Factorial {
    public static void main(String[] args)
    {
        System.out.println(recursiveFact(5));
        System.out.println(iterFact(5));
    }
    
    public static int recursiveFact(int b)
    {
        if(b==0)
            return 1;
        else
            return b*recursiveFact(b-1);
    }
    
    public static int iterFact(int a)
    {
        int count=1;
        
        for(int i=a;i>1;i--)
        {
            count=count*i;
        }
        return count;
    }
}
