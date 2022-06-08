package datastructures.src.com.sample.arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String args[]) {
		int[] arr = { 5, 6, 12, 1 };
		sortArr(arr, arr.length);
		System.out.println(Arrays.toString(sortArr(arr, arr.length)));

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
