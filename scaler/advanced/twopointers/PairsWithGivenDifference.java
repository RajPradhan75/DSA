package datastructures.src.com.scaler.advanced.twopointers;

import java.util.Arrays;

public class PairsWithGivenDifference {

	public static void main(String[] args) {
//		int[] A = { 1, 5, 3, 4, 2 };
		int[] A = {1, 1, 1, 2, 2};
		int B = 0;
		System.out.println(solve(A, B));
	}

	private static int solve(int[] A, int B) {

		Arrays.sort(A);

		int i = 0;
		int j = 1;
		int count = 0;
		int p1 = -1, p2 = -1;

		while (j < A.length) {

			int value = A[j] - A[i];

			if (value < B) {
				j++;
			} else if (value > B) {
				i++;
				if (i == j) {
					j++;
				}

			} else {
				if (p1 != A[j] && p2 != A[i]) {
					count++;
					p1 = A[j];
					p2 = A[i];
				}

				i++;
				j++;
			}
		}

		return count;

	}

}
