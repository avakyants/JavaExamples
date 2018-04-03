package ru.avakyants.java.edu.leetcode.tiq.easy.strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix rs = new LongestCommonPrefix();
		//System.out.println(rs.solution("A man, a plan, a canal: Panama"));
		
		String[] strs = {"aca","cba"};
		
		System.out.println(rs.solution(strs));
	}
	
	public String solution(String[] strs) {
		String prefix = "";
		
		if(strs.length > 0) {
			
			char[] first = strs[0].toCharArray();
		
			for(int k=0; k<first.length;k++) {
				char curCh = first[k]; 
				boolean good=true;
				for(int i=1; i<strs.length;i++) {
					//System.out.println(curCh+":"+strs[i].charAt(k));
					if(strs[i].length()<=k || curCh!=strs[i].charAt(k)) {
						System.out.println("cp1");
						curCh=0;
						good=false;
						break;
					}
				}
				if(good) prefix+=curCh;
				else break;
			}
		}
		
		return prefix;
	}

}
