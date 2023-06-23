package datastructures.src.com.interview;

import java.util.Arrays;

public class AlmostSorted {

    public static void main(String[] args) {
        int[] arr = {11, 9, 2, 3, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] array) {

        // Find the maximum element in the array
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Create a count array of size max+1
        int[] count = new int[max + 1];

        // Count the occurrences of each element in the array
        for (int j : array) {
            count[j]++;
        }

        // Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[index++] = i;
                count[i]--;
            }
        }

    }

}
