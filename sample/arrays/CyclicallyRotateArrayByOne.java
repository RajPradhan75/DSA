package datastructures.src.com.sample.arrays;

import java.util.Arrays;

public class CyclicallyRotateArrayByOne {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int d = 1;
		rightRotate(arr, d, n);
		System.out.println(Arrays.toString(arr));
	}

	static void rotate(int arr[], int n) {
		int temp, i;

		temp = arr[n - 1];
		for (i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;

	}

	public static void rightRotate(int arr[], int d, int n) {
		for (int i = 0; i < d; i++)
			rotate(arr, n);
	}

}
