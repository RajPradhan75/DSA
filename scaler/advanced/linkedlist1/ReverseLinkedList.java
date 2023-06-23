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


    public static void display(ListNode linkedList) {
        ListNode reversedList = reverseList(linkedList); // Reverse the linked list

        ListNode temp = reversedList;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println(); // Add a new line after printing the linked list
    }


    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);

        reverseList(list);

        display(list);

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
