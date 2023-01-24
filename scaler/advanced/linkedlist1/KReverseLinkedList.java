package datastructures.src.com.scaler.advanced.linkedlist1;

import datastructures.src.com.scaler.advanced.linkedlist1.RemoveNthNodeFromEndofList.LL;

public class KReverseLinkedList {

	public static void main(String[] args) {
		int B = 2;
		LL list = new LL(1);
		list.next = new LL(2);
		list.next.next = new LL(3);
		list.next.next.next = new LL(4);
		list.next.next.next.next = new LL(5);
		reverseKGroup(list, B);
		display(list);
	}

	public static void display(LL linkedList) {
		LL temp = linkedList;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	public static LL reverseKGroup(LL head, int k) {
	    LL begin;
	    if (head==null || head.next ==null || k==1)
	    	return head;
	    LL dummyhead = new LL(-1);
	    dummyhead.next = head;
	    begin = dummyhead;
	    int i=0;
	    while (head != null){
	    	i++;
	    	if (i%k == 0){
	    		begin = reverse(begin, head.next);
	    		head = begin.next;
	    	} else {
	    		head = head.next;
	    	}
	    }
	    return dummyhead.next;

	}

	public static LL reverse(LL begin, LL end){
		LL curr = begin.next;
		LL next, first;
		LL prev = begin;
		first = curr;
		while (curr!=end){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		begin.next = prev;
		first.next = curr;
		return first;
	}

}

/*
 * The while(true) loop is used to repeatedly reverse groups of k nodes in the
 * list until we reach the end of the list.
 * 
 * Here is a step by step explanation of what happens in each iteration of the
 * while loop:
 * 
 * We first initialize the tail pointer to the dummy node and use it to traverse
 * k nodes of the list, counting the number of nodes traversed. If we reach the
 * end of the list before finding a group of k nodes, we break out of the loop
 * and return the modified list. If we find a group of k nodes, we use the
 * reverseList function to reverse the group. We then update the next pointers
 * of the nodes to insert the reversed group back into the list at the correct
 * position, without modifying the rest of the list. We update the pre and tail
 * pointers so that they are pointing to the last node of the reversed group.
 * Since the loop continues until we reach the end of the list, the while(true)
 * loop is used to repeat the process until the entire list has been reversed.
 * 
 * The break statement inside the while loop is used as a way to exit the loop
 * and return the modified list. This is useful when we have traversed the
 * entire list and the number of nodes is not a multiple of k, so we don't have
 * any other group to reverse.
 */