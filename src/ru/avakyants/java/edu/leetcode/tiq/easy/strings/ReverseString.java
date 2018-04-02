package ru.avakyants.java.edu.leetcode.tiq.easy.strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseString("hello"));
	}
	
	public String reverseString(String s) {
		return((new StringBuilder(s)).reverse().toString());
		/*char[] ca = s.toCharArray();
		for(int i=ca.length-1;i>=0;i--) {
			sb.append(ca[i]);
		}
        return sb.toString();*/
    }

}
