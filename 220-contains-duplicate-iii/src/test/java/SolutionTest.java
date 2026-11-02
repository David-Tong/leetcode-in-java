import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    void testCase() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 1};
        int indexDiff = 3;
        int valueDiff = 0;
        boolean result = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
        assertTrue(result);
    }

    @Test
    void testCase2() {
        Solution solution = new Solution();
        int[] nums = {1, 5, 9, 1, 5, 9};
        int indexDiff = 2;
        int valueDiff = 3;
        boolean result = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
        assertFalse(result);
    }

    @Test
    void testCase3() {
        Solution solution = new Solution();
        int[] nums = {2147483647, -1, 2147483647};
        int indexDiff = 1;
        int valueDiff = 2147483647;
        boolean result = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
        assertFalse(result);
    }

    @Test
    void testCase4() {
        Solution solution = new Solution();
        int[] nums = {7, 1, 3};
        int indexDiff = 2;
        int valueDiff = 3;
        boolean result = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
        assertTrue(result);
    }
}
