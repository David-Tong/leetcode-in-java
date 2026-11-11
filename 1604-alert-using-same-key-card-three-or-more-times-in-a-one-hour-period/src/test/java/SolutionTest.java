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
        String[] keyName = {"daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"};
        String[] keyTime = {"10:00","10:40","11:00","09:00","11:00","13:00","15:00"};

        Solution solution = new Solution();
        assertEquals(solution.alertNames(keyName, keyTime), List.of("daniel"));
    }

    @Test
    void test2() {
        String[] keyName = {"alice","alice","alice","bob","bob","bob","bob"};
        String[] keyTime = {"12:01","12:00","18:00","21:00","21:20","21:30","23:00"};

        Solution solution = new Solution();
        assertEquals(solution.alertNames(keyName, keyTime), List.of("bob"));
    }

    @Test
    void test3() {
        String[] keyName = {"john","john","john"};
        String[] keyTime = {"23:58","23:59","00:01"};

        Solution solution = new Solution();
        assertEquals(solution.alertNames(keyName, keyTime), List.of());
    }

    @Test
    void test4() {
        String[] keyName = {"a","a","a","a","a","a","b","b","b","b","b"};
        String[] keyTime = {"23:27","03:14","12:57","13:35","13:18","21:58","22:39","10:49","19:37","14:14","10:41"};

        Solution solution = new Solution();
        assertEquals(solution.alertNames(keyName, keyTime), List.of("a"));
    }

    @Test
    void test5() {
        String[] keyName = {"a","a","a","a","a","a","a","b","b","b","b","b","b","b","c","c","c","c","c","c","c","c","c"};
        String[] keyTime = {"00:37","11:24","14:35","21:25","15:48","20:28","07:30","09:26","10:32","20:10","19:26","08:13","01:08","15:49","02:34","06:48","04:33","07:18","00:05","06:44","13:33","04:12","03:54"};

        Solution solution = new Solution();
        assertEquals(solution.alertNames(keyName, keyTime), List.of("c"));
    }

    @Test
    void test6() {
        String[] keyName = {"a","a","a","a","a","a","a","a","b","b","b","b","b","b","b","b","b","b","c","c","c","c","c","c","c","c","d","d","d","d","d","e","e","e","e","e","e","e","e","e","f","f","f","f","f","f","f","g","g","g","g","g","g","g","g","g","h","h","h","h","h","h","h","h","h"};
        String[] keyTime = {"03:42","13:31","20:11","19:10","02:28","23:07","18:03","19:46","01:11","10:05","02:23","04:48","17:22","16:28","04:55","16:18","21:08","06:03","18:25","20:03","03:12","22:51","06:35","14:06","06:48","21:45","00:12","02:21","13:03","06:34","10:20","11:40","00:56","05:17","08:26","23:42","03:22","12:44","09:00","00:57","07:04","08:44","06:10","19:16","06:59","14:24","08:05","18:06","15:10","14:31","17:28","06:24","11:33","07:41","15:43","22:57","22:02","12:42","19:19","06:50","15:02","16:14","13:30","13:34","22:19"};
        Solution solution = new Solution();
        assertEquals(solution.alertNames(keyName, keyTime), List.of("f","h"));
    }
}
