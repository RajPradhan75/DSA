package datastructures.src.com.scaler.advanced.linkedlist2;

public class ListCycle {

	static class Node {
		int key;
		Node next;
	};

	static Node newNode(int key) {
		Node temp = new Node();
		temp.key = key;
		temp.next = null;
		return temp;
	}

	public static void main(String[] args) {

		Node head = newNode(50);
		head.next = newNode(20);
		head.next.next = newNode(15);
		head.next.next.next = newNode(4);
		head.next.next.next.next = newNode(10);

		// Create a loop for testing
		head.next.next.next.next.next = head.next.next;

		Node res = detectAndRemoveCycle(head);
		if (res == null)
			System.out.print("Loop does not exist");
		else
			System.out.print("Loop starting node is " + res.key);

	}

	static Node detectAndRemoveCycle(Node head) {
		// If list is empty or has only one node without loop

		if (head == null || head.next == null)
			return null;

		Node slow = head, fast = head;

		// Move slow with one step and fast with two step

		slow = slow.next;
		fast = fast.next.next;

		// Search for loop using slow and fast pointers

		while (fast != null && fast.next != null) {
			if (slow == fast)
				break;
			slow = slow.next;
			fast = fast.next.next;
		}

		// if loop does not exist
		if (slow != fast)
			return null;
		
		// if loop exist start slow from head and fast from meeting point
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

}
