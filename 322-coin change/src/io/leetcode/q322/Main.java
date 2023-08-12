package io.leetcode.q322;

public class Main {

	public static void main(String[] args) {
		//int[] coins = {1, 2, 5};
		//int amount = 11;
		
		//int[] coins = {2};
		//int amount = 3;
		
		int[] coins = {1};
		int amount = 0;
		
		Solution solution = new Solution();
		System.out.println(solution.coinChange(coins, amount));
	}

}
