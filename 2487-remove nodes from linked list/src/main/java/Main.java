public class Main {

	public static void main(String[] args) {
		//int[] heads = {5,2,13,3,8};
		//int[] heads = {1,1,1,1};
		//int[] heads = {1,2,3,4,5};
		int[] heads = {5,4,3,2,1};
		ListNode head = new ListNode(heads[0]);
		ListNode curr = head;
		for (int i = 1; i < heads.length; i++) {
			ListNode node = new ListNode(heads[i]);
			curr.next = node;
			curr = node;
		}
		
		Solution solution = new Solution();
		head = solution.removeNodes(head);
		StringBuilder result = new StringBuilder();
        for (ListNode node = head; node != null; node = node.next) {
            if (result.length() > 0) {
                result.append(" -> ");
            }
            result.append(node.val);
        }
        System.out.println(result);
	}

}
