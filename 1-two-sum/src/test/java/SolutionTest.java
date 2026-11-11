import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void test() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[] {0, 1}, solution.twoSum(nums, target));
    }

    @Test
    void test2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        assertArrayEquals(new int[] {1, 2}, solution.twoSum(nums, target));
    }

    @Test
    void test3() {
        int[] nums = {3, 3};
        int target = 6;
        assertArrayEquals(new int[] {0, 1}, solution.twoSum(nums, target));
    }
}
