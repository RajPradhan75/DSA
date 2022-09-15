package datastructures.src.com.scaler.advanced.binarysearch3;

import java.util.Arrays;

public class AggressiveCows {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5 };
		int B = 3;
		System.out.println(solve(A, B));
	}

	// https://leetcode.com/discuss/general-discussion/1302335/aggressive-cows-spoj-fully-explained-c

	private static int solve(int[] A, int B) {

		int n = A.length;

		Arrays.sort(A);

		int low = 1;
		int high = A[n - 1];

		int res = 0;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (isPossible(A, mid, B)) {
				res = mid;
				low = mid + 1;
			} else
				high = mid - 1;
		}
		return res;

	}

	private static boolean isPossible(int[] A, int minDist, int B) {

		int cows = 1;
		int lastCowPos = A[0];

		for (int i = 1; i < A.length; i++) {
			if (A[i] - lastCowPos >= minDist) {
				cows++;

				lastCowPos = A[i];
				if (cows >= B)
					return true;
			}
		}
		return false;
	}
}
