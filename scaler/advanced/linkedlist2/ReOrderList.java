package datastructures.src.com.scaler.advanced.linkedlist2;

public class ReOrderList {
	static ListNode head;

	static class ListNode {

		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {

		ReOrderList.head = new ListNode(1);
		ReOrderList.head.next = new ListNode(2);
		ReOrderList.head.next.next = new ListNode(3);
		ReOrderList.head.next.next.next = new ListNode(4);
		ReOrderList.head.next.next.next.next = new ListNode(5);

		solve(head);

		printlist(head);

	}

	static void printlist(ListNode node) {
		if (node == null) {
			return;
		}
		while (node != null) {
			System.out.print(node.val + " -> ");
			node = node.next;
		}
	}

	public static void solve(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		ListNode second = slow.next;
		ListNode prev = slow.next = null;
		while (second != null) {
			ListNode tmp = second.next;
			second.next = prev;
			prev = second;
			second = tmp;
		}

		ListNode first = head;
		second = prev;
		while (second != null) {
			ListNode tmp1 = first.next;
			ListNode tmp2 = second.next;
			first.next = second;
			second.next = tmp1;
			first = tmp1;
			second = tmp2;
		}
	}
}
