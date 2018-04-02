package ru.avakyants.java.edu.leetcode.tiq.easy.strings;

public class StrStr {

	public static void main(String[] args) {
		StrStr rs = new StrStr();
		System.out.println(rs.solution("mississippi","issipi"));
	}	
	
	public int solution(String h, String n) {
		
		if(n.length()>h.length()) return -1;
		
		char[] ha = h.toCharArray();
		char[] na = n.toCharArray();
		
		boolean good = false;
		
		for(int i=0;i<ha.length;i++) {
			for(int j=0;j<na.length;j++) {
				if(na.length>ha.length-i) return -1;
				System.out.println("i="+i+", j="+j+" ("+ha[i+j]+":"+na[j]+")");
				if(ha.length<i+j || ha[i+j]!=na[j]) { good = false; break;}
				good = true;
			}
			if(good) return i;
		}
		
		return (n.equals(""))?0:-1;
	}

}
