package io.leetcode.q920;

public class Solution {
	
	public int numMusicPlaylists(int n, int goal, int k) {
		final int MODULE = (int) (Math.pow(10, 9) + 7);
		
		// dp[x][y] - the number of play lists to listen x songs from y distinct songs
		long[][] dp = new long[goal + 1][n + 1];
		dp[0][0] = 1;
		
		for (int i = 1; i <= goal; i++) {
			for (int j = 1; j <= n; j++) {
				// listen new songs
				dp[i][j] += dp[i - 1][j - 1] * (n - j + 1);
				// listen old songs
				dp[i][j] += dp[i - 1][j] * Math.max(j - k, 0);
				// module
				dp[i][j] %= MODULE;
			}
		}
		
		return (int)dp[goal][n] % MODULE;
    }

}
