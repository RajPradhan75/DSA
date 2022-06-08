package datastructures.src.com.sample.arrays;

import java.util.Arrays;

public class KthSmallestAndLargest {

	public static void main(String[] args) {
		int arr[] = { 49, 48, 96, 12, 32, 21 };
		int n = arr.length;
		int k = 3; // 3rd smallest: 32 and 3rd largest : 48

		System.out.println(Arrays.toString(arr));
		sortArr(arr, n);
		System.out.println();
		System.out.print("Sorted array: " + Arrays.toString(arr));
		System.out.println();
		System.out.println();
		System.out.print("Kth smallest element is " + arr[k - 1]);
		System.out.println();
		System.out.print("Kth largest element is " + arr[n - 3]);

	}

	static int[] sortArr(int[] arr, int n) {

		int temp;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
