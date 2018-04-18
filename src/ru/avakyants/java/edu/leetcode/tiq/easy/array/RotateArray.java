package ru.avakyants.java.edu.leetcode.tiq.easy.array;

public class RotateArray {

	public static void main(String[] args) {
		RotateArray rs = new RotateArray();
		
		int[] nums = {1,2,3,4,5,6,7};
		//			  5 6 7 1 2 3 4
		//            0 1 2 3 4 5 6
		//			  5 6 7 4 1 2 3
		
		rs.solution(nums, 3);
	}
	
	public void solution(int[] nums,int k) {
		
		for(int i=0;i<nums.length-k;i++) {
			System.out.println("i="+i);
			for (int j=0;j<k;j++) {
				System.out.println("i="+i+", j="+j);
				System.out.println("nums[i+j]="+nums[i+j]+", nums[j+i+1]="+nums[j+i+1]);
				int c = nums[i+j];
				nums[i+j] = nums[j+i+1];
				nums[i+j+1]=c;
			}			
		}
		
		for(int i : nums) {
			System.out.println(i);
		}
		
	}

}
