package datastructures.src.com.scaler.advanced.sorting1;

import java.util.Arrays;

public class ConsecutiveElements {

	public static void main(String[] args) {
		int[] A = { 3, 2, 1, 4, 5 };
		System.out.println(solve(A));
	}

	private static int solve(int[] A) {

		Arrays.sort(A);

		for (int i = 1; i < A.length; i++) {

			if (A[i] != A[i - 1] + 1)
			return 0;
		}

		return 1;

	}

}
