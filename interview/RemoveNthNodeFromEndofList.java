package datastructures.src.com.interview;

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


	//Bruteforce
//
//	public ListNode removeNthFromEnd(ListNode head, int n) {
//		// Step 1: Traverse to find the length
//		int length = 0;
//		ListNode curr = head;
//		while (curr != null) {
//			length++;
//			curr = curr.next;
//		}
//
//		// Step 2: Calculate the position from the beginning
//		int position = length - n + 1;
//
//		// Step 3: Traverse again, keeping track of the previous node
//		curr = head;
//		ListNode prev = null;
//		for (int i = 1; i < position; i++) {
//			prev = curr;
//			curr = curr.next;
//		}
//
//		// Step 4: Update the previous node's next pointer to skip the current node
//		if (prev != null) {
//			prev.next = curr.next;
//		} else {
//			// Step 5: If the first node is to be removed, update the head
//			head = head.next;
//		}
//
//		return head;
//	}


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
