package ru.avakyants.java.edu.leetcode.tiq.easy.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

	public static void main(String[] args) {
		FirstUniqueCharacterInString rs = new FirstUniqueCharacterInString();
		System.out.println(rs.solution("loveleetcode"));
	}	
	
	public int solution(String s) {
		int idx= -1;
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(char c : s.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		//map.forEach((k,v)->System.out.print(k+"="+v));
		for(Character c : map.keySet()) {
			if(map.get(c)==1) return s.indexOf(c);;
		}
		
		return idx;
	}

}
