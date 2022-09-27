package datastructures.src.com.scaler.advanced.linkedlist1;

public class DeleteMiddleNode {

	public static void main(String[] args) {
		Node head = null;

		// Use push() function to construct
		// the below list 8 . 23 . 11 . 29 . 12 /
		head = push(head, 12);
		head = push(head, 29);
		head = push(head, 11);
		head = push(head, 23);
		head = push(head, 8);
		
		solve(head);
		System.out.println((head.data));
	}

	static class Node {
		int data;
		Node next;
	};

	public static Node solve(Node A) {
		if (A == null || A.next == null)
			return null;
		Node slow = A, fast = A.next.next;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return A;
	}

	// Function to push node at head
	static Node push(Node head_ref, int new_data) {
		Node new_node = new Node();
		new_node.data = new_data;
		new_node.next = (head_ref);
		(head_ref) = new_node;
		return head_ref;
	}

}
