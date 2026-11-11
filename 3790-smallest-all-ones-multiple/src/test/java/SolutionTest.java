import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void test() {
        int k = 3;
        assertEquals(3, solution.minAllOneMultiple(k));
    }

    @Test
    void test2() {
        int k = 25087;
        assertEquals(25086, solution.minAllOneMultiple(k));
    }
}
