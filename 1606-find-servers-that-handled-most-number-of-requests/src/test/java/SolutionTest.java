import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void test() {
        int k = 3;
        int[] arrival = {1, 2, 3, 4, 5};
        int[] load = {5, 2, 3, 3, 3};

        List<Integer> ans = solution.busiestServers(k, arrival, load);
        assertEquals(ans, List.of(1));
    }

    @Test
    void test2() {
        int k = 3;
        int[] arrival = {1, 2, 3, 4};
        int[] load = {1, 2, 1, 2};

        List<Integer> ans = solution.busiestServers(k, arrival, load);
        assertEquals(ans, List.of(0));
    }

    @Test
    void test3() {
        int k = 3;
        int[] arrival = {1, 2, 3};
        int[] load = {10, 12, 11};

        List<Integer> ans = solution.busiestServers(k, arrival, load);
        assertEquals(ans, List.of(0, 1, 2));
    }

    @Test
    void test4() {
        int k = 3;
        int[] arrival = {1, 2, 3, 4, 8, 9, 10};
        int[] load = {5,2,10,3,1,2,2};

        List<Integer> ans = solution.busiestServers(k, arrival, load);
        assertEquals(ans, List.of(1));
    }

    @Test
    void test5() {
        int k = 1;
        int[] arrival = {1};
        int[] load = {1};

        List<Integer> ans = solution.busiestServers(k, arrival, load);
        assertEquals(ans, List.of(0));
    }
}
