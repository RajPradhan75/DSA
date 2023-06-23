package datastructures.src.com.contest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static datastructures.src.com.contest1.MaximumPositivity.maxPositive;

public class MaximumPositivity {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(5, 6, -1, 7, 8);
        System.out.println(maxPositive(A));

    }

    public static List<Integer> maxPositive(List<Integer> A) {

        int start = -1, end = -1, minStart = -1, minEnd = -1, max = Integer.MIN_VALUE;

        ArrayList<Integer> sub = new ArrayList<>();
        int n = A.size();
        for (int i = 0; i < n; ) {
            if (A.get(i) >= 0) {
                start = i;
                while (i < n && A.get(i) >= 0) {
                    i++;
                }

                end = i - 1;

                if (max < (end - start + 1)) {
                    minStart = start;
                    minEnd = end;
                    max = end - start + 1;
                }

            } else {
                i++;
            }
        }

        for (int i = minStart; i <= minEnd; i++) {
            sub.add(A.get(i));
        }

        return sub;
    }
}
