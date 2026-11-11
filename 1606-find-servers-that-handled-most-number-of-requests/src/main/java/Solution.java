import java.util.*;
import java.util.stream.IntStream;

class Solution {

    record Assignment(int complete, int server) {}

    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        // pre-process
        final int L = arrival.length;
        Comparator<Assignment> comparator = (a ,b) -> Integer.compare(a.complete, b.complete);
        PriorityQueue<Assignment> heap = new PriorityQueue<>(comparator);
        TreeSet<Integer> servers = new TreeSet<>();
        servers.addAll(IntStream.range(0, k).boxed().toList());

        // process
        int[] serverLoads = new int[L];
        int idx = 0;
        while (idx < L) {
            int t = arrival[idx];

            // reclaim
            while (!heap.isEmpty() && heap.peek().complete <= t) {
                servers.add(heap.poll().server);
            }

            // assign
            int target = idx % k;
            Integer server = servers.ceiling(target);
            if (server == null) {
                if (!servers.isEmpty()) {
                    server = servers.first();
                }
            }

            if (server != null) {
                int complete = t + load[idx];
                heap.offer(new Assignment(complete, server));
                servers.remove(server);
                serverLoads[server] += 1;
            }

            idx++;
        }

        // post-process
        // System.out.println(Arrays.toString(serverLoads));
        List<Integer> ans = new ArrayList<>();
        int maxi = 0;
        idx = 0;
        while (idx < L) {
            if (serverLoads[idx] > maxi) {
                maxi = serverLoads[idx];
                ans = new ArrayList<>();
                ans.add(idx);
            } else if (serverLoads[idx] == maxi) {
                ans.add(idx);
            }
            idx++;
        }
        return ans;
    }
}