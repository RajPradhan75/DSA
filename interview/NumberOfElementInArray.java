package datastructures.src.com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfElementInArray {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4, 3, 5, 2, 3, 4, 6, 8};
        countAndPrint(nums);
    }

    private static void countAndPrint(int[] array) {

        Map<Integer, Integer> occurrence = new HashMap<>();

        for (int num : array) {
            occurrence.put(num, occurrence.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(occurrence.entrySet());
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        for (Map.Entry<Integer, Integer> entry : entryList) {
            int num = entry.getKey();
            int count = entry.getValue();
            System.out.println(num + " => " + count + (count == 1 ? " time" : " times"));
        }
    }
}
