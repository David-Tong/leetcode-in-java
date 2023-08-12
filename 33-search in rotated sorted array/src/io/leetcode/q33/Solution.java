package io.leetcode.q33;

public class Solution {
	public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		
		while (left + 1 < right) {
			int middle = (left + right) / 2;
			if (nums[left] < nums[middle]) {
				if (nums[left] <= target && target <= nums[middle]) {
					right = middle;
				} else {
					left = middle + 1;
				} 
			} else {
				if (nums[middle] <= target && target <= nums[right]) {
					left = middle;
				} else {
					right = middle - 1;
				}
			}
		}
		
		if (nums[left] == target) {
			return left;
		} else if (nums[right] == target) {
			return right;
		} else {
			return -1;
		}
    }
}
