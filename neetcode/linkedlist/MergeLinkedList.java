package datastructures.src.com.neetcode.linkedlist;

public class MergeLinkedList {

	public static void main(String[] args) {

		MergeLinkedList linkedlist = new MergeLinkedList();

	}

	Node head;

	public static class Node {
		int val;
		Node next;

		public Node() {
		};

		Node(int val) {
			this.val = val;
		}

		Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {

		public Node mergeTwoLists(Node list1, Node list2) {

			if (list1 == null)
				return list2;
			else if (list2 == null)
				return list1;

			Node dummy = new Node(0);

			Node current = dummy;

			while (list1 != null && list2 != null) {

				if (list1.val < list2.val) {
					current.next = list1;
					list1 = list1.next;
				} else {
					current.next = list2;
					list2 = list2.next;
				}

				current = current.next;
			}

			current.next = list1 == null ? list2 : list1;
			return dummy.next;

		}

	}
}