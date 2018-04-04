package ru.avakyants.java.edu.leetcode.tiq.easy.strings;

public class CountAndSay {

	public static void main(String[] args) {
		CountAndSay rs = new CountAndSay();
		System.out.println(rs.solution(5));
	}
	
	public String solution(int n) {
		
		StringBuilder sb = new StringBuilder();
		
		if(n==1) return "1";
		if(n==2) return "11";
		
		String prev = "11";
		for(int i=3;i<=n;i++) {
		
			int cnt=0;
			String cur = "";
			
			//for(char c : prev.toCharArray()) {
			for(int j=0; j < prev.length();j++) {
				if(!cur.equals(String.valueOf(prev.charAt(j)))) {
					if(j!=0) {
						sb.append(cnt);
						sb.append(cur);
					}
					cnt=1;
					cur = String.valueOf(prev.charAt(j));
					
				}else 
					cnt++;
				
				if(j==prev.length()-1) {
					sb.append(cnt);
					sb.append(cur);
				}
			}
			
			
			prev = sb.toString();
			sb = new StringBuilder();			
		}
		
		return prev;
	}

}
