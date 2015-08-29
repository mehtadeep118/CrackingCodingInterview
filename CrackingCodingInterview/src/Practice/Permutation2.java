/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author Deep
 */
public class Permutation2
{
    private static void permutation(String prefix, String str){
        int n = str.length();
        if (n == 0) 
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), 
            str.substring(0, i) + str.substring(i+1));
        }
    }
    public static void main(String[] args) {
        permutation("", "AAC");
    }
}
