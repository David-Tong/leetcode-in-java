package io.leetcode.q207;

public class Main {

	public static void main(String[] args) {
		/*
		int numCourses = 2;
		int[][] prerequisites = {{1, 0}};
		
		int numCourses = 2;
		int[][] prerequisites = {{1, 0}, {0, 1}};
		
		int numCourses = 5;
		int[][] prerequisites = {{0, 1}, {1, 2}, {2, 3}, {3, 4}};
		*/
		
		int numCourses = 5;
		int[][] prerequisites = {{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 0}};
		
		Solution solution = new Solution();
		boolean ans = solution.canFinish(numCourses, prerequisites);
		
		System.out.println(ans);
	}

}
