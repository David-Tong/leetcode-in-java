package io.leetcode.q207;

import java.util.List;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    	// short-cut
    	if (prerequisites.length == 0) {
    		return true;
    	}
    	
    	// pre-process
    	int[] inDegrees = new int[numCourses];
    	Map<Integer, List<Integer>> dependencies = new HashMap<Integer, List<Integer>>();
    	
    	for (int i = 0; i < prerequisites.length; i++) {
    		inDegrees[prerequisites[i][0]]++;
    		if ( !dependencies.containsKey(prerequisites[i][1])) {
    			dependencies.put(prerequisites[i][1], new ArrayList<Integer>());
    		}
    		dependencies.get(prerequisites[i][1]).add(prerequisites[i][0]);
    	}
   
    	// bfs
    	Deque<Integer> bfs = new ArrayDeque<Integer>();
    	for (int i = 0; i < inDegrees.length; i++) {
    		if (inDegrees[i] == 0) {
    			bfs.addLast(i);
    			inDegrees[i] = -1;
    		}
    	}
    	
    	while (bfs.size() > 0) {
    		int curr = bfs.removeFirst();
    		List<Integer> aDependencies = dependencies.get(curr);
    		if (aDependencies != null) {
    			for (Integer dependency : aDependencies) {
    				inDegrees[dependency]--;
    			}
    		}
    		
    		for (int i = 0; i < inDegrees.length; i++) {
        		if (inDegrees[i] == 0) {
        			bfs.addLast(i);
        			inDegrees[i] = -1;
        		}
        	}
    	}
    	
    	for (int i = 0; i < inDegrees.length; i++) {
    		if (inDegrees[i] > 0) {
    			return false;
    		}
    	}
    	
        return true;
    }
}
