package datastructures.src.com.interview;

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;

        List<Integer> result =
                findSubarrayWithSum(arr, targetSum);
        if (result != null)
            System.out.println("Subarray with sum "
                    + targetSum + " found: " + result);
        else
            System.out.println("No subarray with sum "
                    + targetSum + " found.");
    }

    public static List<Integer> findSubarrayWithSum(int[] arr, int targetSum) {
        List<Integer> subarray = new ArrayList<>();
        int start = 0;
        int end = 0;
        int currentSum = arr[0];

        while (end < arr.length) {
            if (currentSum == targetSum) {
                for (int i = start; i <= end; i++) {
                    subarray.add(arr[i]);
                }
                return subarray;
            }

            if (currentSum < targetSum) {
                end++;
                currentSum += arr[end];
            } else {
                currentSum -= arr[start];
                start++;
            }
        }
        return null;
    }

}
