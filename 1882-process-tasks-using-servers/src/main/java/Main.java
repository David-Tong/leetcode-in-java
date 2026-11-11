import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[] servers = {3,3,2};
        // int[] tasks = {1,2,3,2,1,2};

        int[] servers = {5,1,4,3,2};
        int[] tasks = {2,1,2,4,5,2,1};
        Solution solution = new Solution();
        int[] ans = solution.assignTasks(servers, tasks);
        System.out.println(Arrays.toString(ans));
    }
}
