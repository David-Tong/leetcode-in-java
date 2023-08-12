package io.leetcode.q664;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	private Map<String, Integer> cache = new HashMap<String, Integer>();
	
	public int strangePrinter(String s) {
		return print(0, s.length() - 1, s);
    }

	private int print(int i, int j, String s) {
		String key = Integer.toString(i) + "-" + Integer.toString(j);
		if (cache.containsKey(key)) {
			return cache.get(key);
		}
		
		if (i > j) {
			return 0;
		} else if (i == j) {
			return 1;
		} else {
			int ans = 1 + print(i + 1, j, s);
			for (int k = i + 1; k <= j; k++) {
				if (s.charAt(k) == s.charAt(i)) {
					ans = Math.min(ans, print(i, k - 1, s) + print(k + 1, j, s));
				}
			}
			cache.put(key, ans);
			return ans;
		}
	}
}
