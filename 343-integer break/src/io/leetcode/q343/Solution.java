package io.leetcode.q343;

class Solution {
    public int integerBreak(int n) {
    	int[] dp = new int[n + 1];
    	dp[2] = 1;
    	
    	for (int i = 3; i <= n; i++) {
    		dp[i] = Math.max(Math.max(2 * (i - 2), 2 * dp[i - 2]),
    				Math.max(3 * (i - 3), 3 * dp[i - 3]));
    	}
    	return dp[n];    			
    }
}
