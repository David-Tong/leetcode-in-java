import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void test() {
        String s = "abcabcbb";
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void test2() {
        String s = "bbbbb";
        assertEquals(1, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void test3() {
        String s = "pwwkew";
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }
}
