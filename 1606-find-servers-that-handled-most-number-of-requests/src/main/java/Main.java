import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int k = 3;
        int[] arrival = {1, 2, 3, 4, 5};
        int[] load = {5, 2, 3, 3, 3};

        List<Integer> ans = solution.busiestServers(k, arrival, load);
        System.out.println(ans);
    }
}
