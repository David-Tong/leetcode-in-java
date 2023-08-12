package io.leetcode.q33;

public class Main {

	public static void main(String[] args) {
		/*
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		int target = 0;
		
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		int target = 3;
		
		int[] nums = {1};
		int target = 0;
		
		int[] nums = {0, 1, 2, 3, 4, 5, 6, 7};
		int target = 3; */
		
		int[] nums = {7, 0, 1, 2, 3, 4, 5, 6};
		int target = 6;
		
		Solution solution = new Solution();
		int ans = solution.search(nums, target);
		System.out.println(ans);
	}

}
