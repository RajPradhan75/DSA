package datastructures.src.com.interview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RepeatAndMissingNum {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4, 6, 7, 5};
        System.out.println(Arrays.toString(findRepAndMissNum(arr)));
    }

    private static int[] findRepAndMissNum(int[] arr) {

        int n = arr.length;
        int[] hash = new int[n + 1];

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        int repeating = -1, missing = -1;

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) repeating = i;
            else if (hash[i] == 0) missing = i;

            if (repeating != -1 && missing != -1)
                break;
        }

        int[] ans = {repeating, missing};
        return ans;
    }

}
