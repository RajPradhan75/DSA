package datastructures.src.com.scaler.advanced.twopointers;

import java.util.Arrays;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5 };
		int B = 5;
		System.out.println(Arrays.toString(solve(A, B)));
	}

	private static int[] solve(int[] arr, int sum) {
		int n = arr.length;
		long curr_sum = arr[0];
		int ans[] = { -1 }, start = 0, i;
		// Pick a starting point
		for (i = 1; i <= n; i++) {
			// If curr_sum exceeds the sum,
			// then remove the starting elements
			while (curr_sum > sum && start < i - 1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}

			// If curr_sum becomes equal to sum,
			// then return true
			if (curr_sum == sum) {
				return Arrays.copyOfRange(arr, start, i);
			}

			// Add this element to curr_sum
			if (i < n)
				curr_sum = curr_sum + arr[i];
		}
		return ans;
	}

}
