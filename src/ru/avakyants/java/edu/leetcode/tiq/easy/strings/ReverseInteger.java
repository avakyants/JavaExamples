package ru.avakyants.java.edu.leetcode.tiq.easy.strings;

public class ReverseInteger {

	public static void main(String[] args) {
		ReverseInteger rs = new ReverseInteger();
		System.out.println(rs.reverseInteger(-2147483648));

	}
	
	public int reverseInteger(int x) {
		StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(Long.valueOf(String.valueOf(x)))));
		long xx = (x>=0)?Long.parseLong((sb.reverse().toString())):-Long.parseLong(sb.reverse().toString());
		return (xx<Integer.MIN_VALUE || xx>Integer.MAX_VALUE)?0:(int)xx;
    }

}
