/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

import java.util.HashMap;

/**
 *
 * @author Deep
 */
public class isoMorphic {
    public static void main(String[] args)
    {
        System.out.println(check("app","bar"));
    }
    public static boolean check(String s,String t){  
        if(s.length()!=t.length()) return false;  
        HashMap<Character,Character> map1=new HashMap<Character, Character>();  
        HashMap<Character,Character> map2=new HashMap<Character, Character>();  
          
        for(int i=0;i<s.length();i++){  
            char c1=s.charAt(i);  
            char c2=t.charAt(i);  
            if(map1.containsKey(c1)){  
                if(map1.get(c1)!=c2) return false;  
            
            }  
            if(map2.containsKey(c2)){  
                if(map2.get(c2)!=c1) return false;  
            }  
              
            map1.put(c1, c2);  
            map2.put(c2, c1);  
        }  
        return true;  
    }  
    
}
