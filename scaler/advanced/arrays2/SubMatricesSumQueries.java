package datastructures.src.com.scaler.advanced.arrays2;

import java.util.Arrays;

public class SubMatricesSumQueries {

	public static void main(String[] args) {

		int[][] A = { { 1, 2, 3 },
				      { 4, 5, 6 }, 
				      { 7, 8, 9 } };

		int[] B = { 1, 2 };
		int[] C = { 1, 2 };
		int[] D = { 2, 3 };
		int[] E = { 2, 3 };

		System.out.println(Arrays.toString(solve(A, B, C, D, E)));
	}

	public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {

		prefixSumMatrix(A);
		int[] result = new int[B.length];
		for (int i = 0; i < B.length; i++) {
			int a1 = B[i] - 1;
			int b1 = C[i] - 1;

			int a2 = D[i] - 1;
			int b2 = E[i] - 1;

			int sum = A[a2][b2];

			if (b1 > 0) {
				sum -= A[a2][b1 - 1];
			}

			if (a1 > 0) {
				sum -= A[a1 - 1][b2];
			}

			if (a1 > 0 && b1 > 0) {
				sum += A[a1 - 1][b1 - 1];
			}

			result[i] = getMod(sum);

		}

		return result;
	}

	private static void prefixSumMatrix(int[][] A) {
		for (int row = 0; row < A.length; row++) {
			int sum = A[row][0];
			for (int col = 1; col < A[row].length; col++) {
				sum = getMod(sum + A[row][col]);
				A[row][col] = sum;
			}
		}

		for (int col = 0; col < A[0].length; col++) {
			int sum = A[0][col];
			for (int row = 1; row < A.length; row++) {
				sum = getMod(sum + A[row][col]);
				A[row][col] = sum;
			}
		}
	}

	private static int getMod(int num) {
		int mod = 1000000007;

		int res = num % mod;

		if (res < 0) {
			return (res + mod) % mod;
		}

		return res;
	}

}
