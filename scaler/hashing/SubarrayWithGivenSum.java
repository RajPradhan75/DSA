package datastructures.src.com.scaler.hashing;

import java.util.Arrays;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 5 };
		int B = 5;

		System.out.println(Arrays.toString(solve(A, B)));
	}

	public static int[] solve(int[] A, int B) {

		int left = 0;

		int right = 1;

		int[] prefixSum = new int[A.length];

		for (int i = 0; i < A.length; i++) {

			if (i == 0)
				prefixSum[i] = A[i];
			else
				prefixSum[i] = prefixSum[i - 1] + A[i];

		}

		int sum = 0;

		while (left <= right && right < A.length) {

			if (left == 0)
				sum = prefixSum[right];
			else
				sum = prefixSum[right] - prefixSum[left - 1];

			if (sum == B)
				return prepareArray(left, right, A);
			else if (sum < B)
				right++;
			else
				left++;
		}
		return new int[] { -1 };
	}

	public static int[] prepareArray(int left, int right, int[] A) {
		// System.out.print(l);
		// System.out.print(r);
		int res[] = new int[right - left + 1];
		int i = 0;
		while (left <= right) {
			res[i++] = A[left++];
		}

		return res;
	}

}
