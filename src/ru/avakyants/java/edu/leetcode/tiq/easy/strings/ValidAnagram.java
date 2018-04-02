package ru.avakyants.java.edu.leetcode.tiq.easy.strings;

import java.util.List;
import java.util.stream.Collectors;

public class ValidAnagram {

	public static void main(String[] args) {
		ValidAnagram rs = new ValidAnagram();
		System.out.println(rs.solution("aacc","ccac"));
	}	
	
	public boolean solution(String s, String t) {
		
		if(s.length()!=t.length()) return false;
		
		List<Character> sl = s.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		List<Character> tl = t.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		
		
		for(Character ch : sl) {
			if(!tl.contains(ch)) return false;
			tl.remove(tl.indexOf(ch));
		}		
		return true;
		
		/*1*/
		/* if (s.length() != t.length()) {
		        return false;
		    }
		    char[] str1 = s.toCharArray();
		    char[] str2 = t.toCharArray();
		    Arrays.sort(str1);
		    Arrays.sort(str2);
		    return Arrays.equals(str1, str2);*/
		
		/*2*/
		/*if (s.length() != t.length()) {
	        return false;
	    }
	    int[] counter = new int[26];
	    for (int i = 0; i < s.length(); i++) {
	        counter[s.charAt(i) - 'a']++;
	        counter[t.charAt(i) - 'a']--;
	    }
	    for (int count : counter) {
	        if (count != 0) {
	            return false;
	        }
	    }
	    return true;*/
	}

}
