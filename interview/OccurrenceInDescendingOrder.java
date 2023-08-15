package datastructures.src.com.interview;

import java.util.*;

public class OccurrenceInDescendingOrder {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 3, 5, 2, 3, 4, 6, 8};
        countOccurence(arr);
    }

    private static void countOccurence(int[] arr) {

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sortedElements
                = new ArrayList<>(freqMap.entrySet());
        Collections.sort(sortedElements, (a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<Integer, Integer> entry : sortedElements) {
            System.out.println(entry.getKey() + " => " + entry.getValue() + " times");
        }
    }
}
