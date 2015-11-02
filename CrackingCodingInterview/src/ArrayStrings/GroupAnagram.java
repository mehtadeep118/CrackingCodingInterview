/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Deep
 */
public class GroupAnagram {
    public static void main(String[] args)
    {   
        List<String> s = new LinkedList<String>();
        String[] d={"art","tar","top","pot","neat","rat","tape","nate","peat","random"};
        s=anagrams(d);
        System.out.println(s);
    }
   public static List<String> anagrams(String[] strs) {
        HashMap<String, LinkedList<String>> dict = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = String.valueOf(chars);
            if (dict.containsKey(sortedString)) {
                dict.get(sortedString).add(s);
            } else {
                LinkedList<String> list = new LinkedList<>();
                list.add(s);
                dict.put(sortedString, list);
            }
        }
        List<String> ret = new LinkedList<>();
        for (LinkedList<String> list : dict.values()) {
            if (list.size() > 1)
                ret.addAll(list);
        }
        return ret;
    }
}
