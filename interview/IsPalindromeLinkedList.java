package datastructures.src.com.interview;

public class IsPalindromeLinkedList {

    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }



    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(head));
    }


    private static boolean isPalindrome(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

         slow = reverse(slow);
         fast = head;

         while (slow != null){
             if(slow.val != fast.val){
                 return false;
             }
             slow = slow.next;
             fast = fast.next;
         }
         return true;
    }



    private static ListNode reverse(ListNode head){

        ListNode prev = null;

        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}
