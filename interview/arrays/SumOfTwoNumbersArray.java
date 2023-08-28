package datastructures.src.com.interview.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfTwoNumbersArray {

    public static void main(String[] args) {
//        List<Integer> num1 = new ArrayList<>();
//        num1.add(1);
//        num1.add(2);
//        num1.add(3);
//
//        List<Integer> num2 = new ArrayList<>();
//        num2.add(2);
//        num2.add(1);
//        num2.add(4);

//        Output : 337
//        123 + 214 = 337

        List<Integer> num1 = Arrays.asList(9, 5, 4, 9);
        List<Integer> num2 = Arrays.asList(2, 1, 4);
        //Output : 9763

        List<Integer> sum = addTwoNumbers(num1, num2);

        System.out.print("Number 1: ");
        for (Integer digit : num1) {
            System.out.print(digit);
        }
        System.out.println();

        System.out.print("Number 2: ");
        for (Integer digit : num2) {
            System.out.print(digit);
        }
        System.out.println();

        System.out.print("Sum of two numbers: ");
        for (Integer digit : sum) {
            System.out.print(digit);
        }
    }

    private static List<Integer> addTwoNumbers(List<Integer> num1, List<Integer> num2) {
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 0;

        int i = num1.size() - 1;
        int j = num2.size() - 1;

        while (i >= 0 || j >= 0) {
            int digit1 = (i >= 0) ? num1.get(i) : 0;
            int digit2 = (j >= 0) ? num2.get(j) : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.add(sum % 10);

            i--;
            j--;
        }

        if (carry > 0) {
            result.add(carry);
        }

        Collections.reverse(result);
        return result;
    }

}
