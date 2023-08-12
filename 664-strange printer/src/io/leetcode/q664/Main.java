package io.leetcode.q664;

public class Main {

	public static void main(String[] args) {
		String s = "aba";
		Solution solution = new Solution();
		int ans = solution.strangePrinter(s);
		System.out.println(String.format(
				"The minimum number of turns the printer needed to print %s is %d.", s, ans));
	}

}
