package datastructures.src.com.interview.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxOfTwoNumber {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(15);
        numbers.add(8);

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        System.out.println("Max 1: " + max1);
        System.out.println("Max 2: " + max2);
    }
}
