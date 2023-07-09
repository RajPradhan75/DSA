package datastructures.src.com.interview;

public class SearchMinimumInRotatedSearchArray {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(findMin(arr));
    }

    private static int findMin(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            if (arr[left] <= arr[right]) {
                return arr[left];
            }
            int mid = left + (right - left) / 2;

            for (int i = 0; i < arr.length; i++) {
                if (arr[left] <= arr[mid]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }
        return 0;
    }
}
