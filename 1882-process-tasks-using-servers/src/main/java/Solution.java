import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    private int[] servers;
    private PriorityQueue<int[]> idle;
    private PriorityQueue<int[]> busy;

    Solution() {
        Comparator<int[]> comparator = (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        };
        idle = new PriorityQueue<>(comparator);
        busy = new PriorityQueue<>(comparator);
}

public int[] assignTasks(int[] servers, int[] tasks) {
    // pre-process
    this.servers = servers;
    final int L = tasks.length;
    for (int idx = 0; idx < servers.length; idx++) {
        idle.offer(new int[]{servers[idx], idx});
    }

    // process
    int[] ans = new int[L];
    int now = 0;
    int idx = 0;
    while (idx < L) {
        now = Math.max(now, idx);
        release(now);

        // check
        if (idle.isEmpty()) {
            assert busy.peek() != null;
            now = busy.peek()[0];
            release(now);
        }

        assert idle.peek() != null;
        int server = idle.poll()[1];
        busy.offer(new int[]{now + tasks[idx], server});
        ans[idx] = server;
        idx++;
    }
    return ans;
}

private void release(int now) {
    while (!busy.isEmpty() && busy.peek()[0] <= now) {
        int idx = busy.poll()[1];
        idle.offer(new int[]{servers[idx], idx});
    }
}
}