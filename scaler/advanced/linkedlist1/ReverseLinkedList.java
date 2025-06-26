package datastructures.src.com.scaler.advanced.linkedlist1;

import java.util.Stack;

public class ReverseLinkedList {
//	ListNode head;

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    // Recursive reverse
    public static ListNode reverseListRecursive(ListNode head) {
        // Base case: if head is null or only one node, it's already reversed
        if (head == null || head.next == null) {
            return head;
        }

        // Reverse the rest list
        ListNode newHead = reverseListRecursive(head.next);

        // Make the next node point to current node
        head.next.next = head;
        head.next = null;

        return newHead;
    }


    public static void display(ListNode linkedList) {
        ListNode reversedList = reverseList(linkedList); // Reverse the linked list

        ListNode temp = reversedList;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    // Display using recursive reverse
    public static void display(ListNode linkedList, boolean useRecursive) {
        ListNode reversedList;
        if (useRecursive) {
            reversedList = reverseListRecursive(linkedList);
        } else {
            reversedList = reverseList(linkedList);
        }

        ListNode temp = reversedList;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);

        System.out.println("Reversed using Iterative:");
        display(list);
        System.out.println();
        // Rebuild list again because it was mutated by previous reversal
        list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);

        System.out.println("Reversed using Recursive:");
        display(list, true); // Use recursive

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
