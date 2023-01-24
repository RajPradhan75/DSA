package datastructures.src.com.scaler.advanced.linkedlist1;

public class RemoveNthNodeFromEndofList {

	static class LL {
		int val;
		LL next;

		LL() {
		}

		LL(int val) {
			this.val = val;
		}

		LL(int val, LL next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		int n = 2;
		LL linkedList = new LL(1);
		linkedList.next = new LL(2);
		linkedList.next.next = new LL(3);
		linkedList.next.next.next = new LL(4);
		linkedList.next.next.next.next = new LL(5);
		removeNthFromEnd(linkedList, n);
		display(linkedList);
	}

	public static LL removeNthFromEnd(LL head, int n) {
		LL start = new LL();
		start.next = head;
		LL slow = start;
		LL fast = start;

		for (int i = 0; i <= n; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;

		return start.next;
	}

	public static void display(LL linkedList) {
		LL temp = linkedList;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
}
