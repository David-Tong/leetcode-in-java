import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int minAllOneMultiple(int k) {
        // process
        final Set<Integer> remainders = new TreeSet<>();
        int ans = 1;
        int remainder = 1 % k;
        while (true) {
            if (remainder == 0) {
                return ans;
            }
            if (remainders.contains(remainder)) {
                return -1;
            }
            remainders.add(remainder);
            remainder = (10 * remainder + 1) % k;
            ans++;
        }
    }
}