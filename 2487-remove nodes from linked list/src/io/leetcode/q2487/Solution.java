package io.leetcode.q2487;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	public ListNode removeNodes(ListNode head) {
		// dummy node
		ListNode dummy = new ListNode();
		dummy.next = head;
		
		// monotonic stack
		int index = 0;
		ListNode node = head;
		
		Deque<int[]> stack = new ArrayDeque<int[]>();
		while (node != null) {
			while (!stack.isEmpty() && stack.getLast()[1] < node.val) {
				stack.removeLast();
			}
			int[] pair = {index, node.val};
			stack.addLast(pair);
			index++;
			node = node.next;
		}
		
		// reconstruct linked list
		int base = 0;
		ListNode curr = dummy;
		
		node = head;
		while (stack.size() > 0) {
			index = stack.pop()[0];
			for (int i = 0; i < index - base; i++) {
				node = node.next;
			}
			curr.next = node;
			curr = curr.next;
			base = index;
		}
		
		return dummy.next;
    }
}
