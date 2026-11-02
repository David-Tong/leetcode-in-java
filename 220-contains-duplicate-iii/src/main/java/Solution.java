import java.util.TreeSet;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Integer> set = new TreeSet<>();
        int index = 0;
        while (index < nums.length) {
            if (index > indexDiff) {
                set.remove(nums[index - indexDiff - 1]);
            }
            // search left
            Integer ceiling = set.ceiling(nums[index] - valueDiff);
            if (ceiling != null && ceiling <= nums[index] + valueDiff) {
                return true;
            }

            // search right
            Integer floor = set.floor(nums[index] + valueDiff);
            if (floor != null && floor >= nums[index] - valueDiff) {
                return true;
            }
            set.add(nums[index]);
            index += 1;
        }
        return false;
    }
}