/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayStrings;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author deep
 */
public class GroupAnagram2 {
	public static void main(String[] args){
		String[] arrwords = {"art","tar","top","pot","neat","rat","tape","nate","peat","random"};
		String[] srtdarrwords = sortAlphabetsInEachWord(arrwords);
		HashMap<String, String> wordmap = new HashMap<String,String>();
		int i=0;
		for(String s : srtdarrwords){
			System.out.println(s);
			if(wordmap.containsKey(s)){
				wordmap.put(s,wordmap.get(s)+","+arrwords[i++]);
				System.out.println("already contains, so adding");
				System.out.println(wordmap.get(s));
			}
			else{
				wordmap.put(s,arrwords[i++]);
			}
		}
		for(String s : wordmap.keySet()){
			System.out.println("["+wordmap.get(s)+"]");
		}
		
	}
	private static String[] sortAlphabetsInEachWord(String[] inparr){
		String[] retstr = new String[inparr.length];
		int i=0;
		for (String s : inparr){
			retstr[i++] = s;
		}
		i=0;
		for (String s : retstr){
			char[] alphword = s.toCharArray();
			Arrays.sort(alphword);
			s = new String(alphword);
			retstr[i++] = s;
		}
		return retstr;
	}

}
