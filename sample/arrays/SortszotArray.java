package datastructures.src.com.sample.arrays;

import java.util.Arrays;

public class SortszotArray {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 0, 1, 2 };
		int n = arr.length;
		arrangeZot(arr, n);
		System.out.println(Arrays.toString(arr));
	}

	static void arrangeZot(int[] arr, int n) {

		int low = 0;
		int high = n - 1;
		int mid = 0;
		int temp;

		while (mid <= high) {
			switch (arr[mid]) {
			case 0: {
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				break;
			}
			}
		}

	}

}

// Time Complexity: O(N)

// Space Complexity: O(1)
