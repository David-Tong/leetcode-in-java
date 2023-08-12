package io.leetcode.q63;

public class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		final int M = obstacleGrid.length;
		final int N = obstacleGrid[0].length;
		
		// dp
		int[][] dp = new int[M][N];
		dp[0][0] = 1;
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (obstacleGrid[i][j] == 1) {
					dp[i][j] = 0;
				} else {
					if (i - 1 >= 0) {
						dp[i][j] += dp[i - 1][j];
					}
					if (j - 1 >= 0) {
						dp[i][j] += dp[i][j - 1];
					}
				}
			}
		}
		
		return dp[M - 1][N - 1];
    }
}
