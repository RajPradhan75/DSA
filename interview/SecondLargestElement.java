package datastructures.src.com.interview;

import java.util.PriorityQueue;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 3, 6};
        findSecondLargest(arr);
    }

    private static void findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        if (arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            first = Math.max(arr[i], first);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != first) {
                second = Math.max(arr[i], second);
            }
        }
        System.out.println("Second largest: "+second);
    }
}
