import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // process
        final int L = s.length();
        final Map<Character, Integer> map = new HashMap<>();

        int ans = 0;
        int left = 0, right = 0;
        while (right < L) {
            // extend right
            Character ch = s.charAt(right);
            map.putIfAbsent(ch, 0);
            map.put(ch, map.get(ch) + 1);
            right++;

            // shrink left
            while (isDuplicated(map)) {
                ch = s.charAt(left);
                map.put(ch, map.get(ch) - 1);
                left++;
            }
            ans = Math.max(ans, right - left);
        }
        return ans;
    }

    private boolean isDuplicated(Map<Character, Integer> map) {
        return map.values().stream().anyMatch(value -> value > 1);
    }
}