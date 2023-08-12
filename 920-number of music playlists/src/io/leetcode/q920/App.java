package io.leetcode.q920;

public class App {

	public static void main(String[] args) {
		int n = 16;
		int goal = 16;
		int k = 4;
		
		Solution solution = new Solution();
		int ans = solution.numMusicPlaylists(n, goal, k);
		System.out.println(String.format("There are %d possible playlists", ans));
	}

}
