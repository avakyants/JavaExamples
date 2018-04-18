package ru.avakyants.java.edu.leetcode.tiq.easy.array;

import java.util.*;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		RemoveDuplicatesSortedArray rs = new RemoveDuplicatesSortedArray();
		
		//int[] nums = {1,1,1,2};
		int[] nums = {1,1,1,2,2,2,2,3,4,5,6,7,7};
		
		System.out.println("Answer:"+rs.solution(nums));
	}
	
	public int solution(int[] nums) {
		
		Set<Integer> uniq = new HashSet<>();
		
		for(int i=0;i<nums.length;i++) {
			int next = i+1;
			uniq.add(nums[i]);
			if(next<nums.length && nums[i]==nums[next]) {
				
				for(int j=next;j<nums.length;j++) {
					if(nums.length>(j+1)) {
						int c = nums[j+1];
						nums[j+1]=nums[j];
						nums[j]=c;
					}
				}
				if(next!=nums.length-1) {
					i--;
				}
				
			}
		}
		
		for(int i : nums) {
			System.out.println(i);
		}
		
		return uniq.size();
		
	}

}

/*
11222345677 0
12223456771 1
12234567712 2



 */
