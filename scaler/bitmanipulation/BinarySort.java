package datastructures.src.com.scaler.bitmanipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySort {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(4, 1, 12, 7, 6));
        List<Integer> sortedNums = sortByBinary(nums);
        System.out.println(sortedNums);
    }

    private static List<Integer> sortByBinary(List<Integer> nums) {
        // Step 1: helper function to count the number of 1s in the binary representation
        Comparator<Integer> countBits = (a,b) -> Integer.bitCount(a) - Integer.bitCount(b);

        // Step 2: Define a custom comparator using lambda expression
        Comparator<Integer> customComparator = (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);

            if (countA == countB) {
                return a.compareTo(b);
            }
            return Integer.compare(countA, countB);
        };

        // Step 3: Sort the list using the custom comparator
        Collections.sort(nums, customComparator);

        // Step 4: Return the sorted list
        return nums;
    }


}
