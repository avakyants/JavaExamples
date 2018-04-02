package ru.avakyants.java.edu.leetcode.tiq.easy.strings;

public class ValidPalindrome {

	public static void main(String[] args) {
		ValidPalindrome rs = new ValidPalindrome();
		//System.out.println(rs.solution("A man, a plan, a canal: Panama"));
		System.out.println(rs.solution("A man, a plan, a canal: Panama"));
	}	
	
	public boolean solution(String s) {
		
		/*String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";
		
		s = s.toLowerCase();
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			if(alphabet.indexOf(c)!=-1) sb.append(c);
		}
		
		
		
		s = sb.toString();
		for(int i=0;i<s.length();i++) {
			//System.out.println(i+":"+s.charAt(i)+"="+s.charAt(s.length()-1-i));
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
		}
		
		return true;*/
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";
		
		s = s.toLowerCase();
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			if(alphabet.indexOf(c)!=-1) sb.append(c);
		}
		
		s = sb.toString();
		String s2 = sb.reverse().toString();
		
		return s.equals(s2);
	}

}
