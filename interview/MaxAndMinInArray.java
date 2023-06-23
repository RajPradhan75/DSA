package datastructures.src.com.interview;

public class MaxAndMinInArray {

    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 7, 5};
        findMinMax(arr);
    }

    private static void findMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//
//            min = Math.min(arr[i], min);
//            max = Math.max(arr[i], max);
//
//        }


        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Min value: " + min + ", " + "Max value: " + max);
    }


}
