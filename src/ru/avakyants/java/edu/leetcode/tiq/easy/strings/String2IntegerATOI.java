package ru.avakyants.java.edu.leetcode.tiq.easy.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String2IntegerATOI {

	public static void main(String[] args) {
		String2IntegerATOI rs = new String2IntegerATOI();
		System.out.println(rs.solution("abc"));
	}	
	
	public int solution(String s) {
		boolean sign = false;
		s = s.trim();
		int idx = -1;
		List<Character> valid = new ArrayList<>();//{'0','1','2','3','4','5','6','7','8','9','-','+'};
		valid.add('0');
		valid.add('1');
		valid.add('2');
		valid.add('3');
		valid.add('4');
		valid.add('5');
		valid.add('6');
		valid.add('7');
		valid.add('8');
		valid.add('9');
		valid.add('-');
		valid.add('+');
		
		for(int i=0;i<s.toCharArray().length;i++) {
			if(valid.contains(s.charAt(i))) {
				if((s.charAt(i)=='+' || s.charAt(i)=='-') && !sign) sign = true;
				else if(s.charAt(i)=='+' || s.charAt(i)=='-') break;
				idx = i;
			}
			else break;
		}
		//System.out.println(idx);
		if(s.length()==0 || (s.substring(0, idx+1).length()==1 && (s.charAt(0)=='-' || s.charAt(0)=='+')) || idx==-1) return 0;
		try {
			long num = Long.parseLong(s.substring(0, idx+1));
			//System.out.println(num);
			return (num<Integer.MIN_VALUE)?Integer.MIN_VALUE:((num>Integer.MAX_VALUE)?Integer.MAX_VALUE:(int)num);
		}catch(NumberFormatException e) {
			return (s.charAt(0)=='-')?Integer.MIN_VALUE:Integer.MAX_VALUE;
		}
	}

}
