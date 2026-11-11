import java.util.*;

class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        // pre-process
        final int L = keyName.length;
        Map<String, List<Integer>> map = new HashMap<>();
        // pre-process input
        for (int i = 0; i < L; i++) {
            map.computeIfAbsent(keyName[i],
                    key -> new ArrayList<>()
            ).add(convert(keyTime[i]));
        }
        // sort
        map.values().forEach(Collections::sort);
        // System.out.println(map);

        // process
        List<String> ans = new ArrayList<>();
        for (String name: map.keySet().stream().sorted().toList()) {
            List<Integer> times = map.get(name);
            for (int i=2; i<times.size(); i++) {
                if (times.get(i - 2) >= times.get(i) - 60) {
                    ans.add(name);
                    break;
                }
            }
        }
        return ans;
    }

    private int convert(String time) {
        String[] tokens = time.split(":");
        return Integer.parseInt(tokens[0]) * 60 + Integer.parseInt(tokens[1]);
    }
}