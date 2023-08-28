package datastructures.src.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDiff {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3};
        //output: [[1,2],[2,3],[3,4]]
        System.out.println(findMinAbsDiff(arr));

    }

    private static List<List<Integer>> findMinAbsDiff(int[] arr) {

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {

            int diff = arr[i] - arr[i - 1];

            if (diff < minDiff) {
                minDiff = diff;
                result.clear();
            }

            if (diff == minDiff) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                result.add(pair);
            }
        }
        return result;
    }
}
