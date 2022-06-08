
package datastructures.src.com.sample.arrays;

import java.util.Arrays;

public class SegregateIntegers {

	public static void main(String[] args) {
		int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
		int n = arr.length;
		segregateElements(arr, n);
		System.out.println(Arrays.toString(arr));

	}

	static void segregateElements(int arr[], int n) {
		int temp ;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(arr[i]<0 && arr[j]>=0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
