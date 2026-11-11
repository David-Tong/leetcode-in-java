import java.util.*;
import java.util.stream.IntStream;

class Solution {
    record Pair(int index, int num) {
    }

    public int[] twoSum(int[] nums, int target) {
        // pre-process
        List<Pair> pairs = new ArrayList<Pair>(
                IntStream.range(0, nums.length)
                         .mapToObj(index -> new Pair(index, nums[index]))
                         .toList()
        );

        // process
        Comparator<Pair> comparator = Comparator.comparingInt(Pair::num);
        pairs.sort(comparator);
        int left = 0, right = pairs.size() - 1;
        while (left < right) {
            if (pairs.get(left).num + pairs.get(right).num == target) {
                return new int[]{pairs.get(left).index, pairs.get(right).index};
            } else if (pairs.get(left).num + pairs.get(right).num < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
}