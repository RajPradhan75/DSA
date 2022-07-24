package datastructures.src.com.scaler.array.sorting;

import java.util.Arrays;

public class NobleElement {

	public static void main(String[] args) {
		int[] A = { 3, 2, 1, 3 };
		System.out.println(solve(A));
	}

	public static int solve(int[] A) {

		// Bruteforce
//		int size = A.length;
//		for (int i = 0; i < size; i++) {
//			int count = 0;
//			for (int j = 0; j < size; j++)
//				if (A[i] < A[j])
//					count++;
//		
//			// If count of greater elements
//			// is equal to arr[i]
//			if (count == A[i])
//				return A[i];
//		}

		Arrays.sort(A);

		int count = 0;

		int n = A.length;
		    // duplicate
		for (int i = 0; i < n - 1; i++) {
			if (A[i] == A[i + 1])
				continue;

			// noble
			if (A[i] == n - i - 1) {
				return A[i];
//			return 1;
			}

		}

		if (A[n - 1] == 0) {
			return A[n - 1];
//			return 1;
		}
		return -1;
	}

}
