package datastructures.src.com.scaler.advanced.linkedlist1;

import datastructures.src.com.scaler.advanced.linkedlist1.DeleteMiddleNode.Node;

public class DeleteNodeFromLL {
	public static void main(String[] args) {
		Node head = null;

		// Use push() function to construct
		// the below list 4,5,1,9 /
		head = push(head, 9);
		head = push(head, 1);
		head = push(head, 5);

		head = push(head, 4);

		
	

		solve(head);
		System.out.println((head.data));
	}

	static class Node {
		int data;
		Node next;
	};

	public static void solve(Node node) {

		if (node != null && node.next != null) {
			node.data = node.next.data;
			node.next = node.next.next;
		}
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
