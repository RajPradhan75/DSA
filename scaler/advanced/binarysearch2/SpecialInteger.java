package datastructures.src.com.scaler.advanced.binarysearch2;

public class SpecialInteger {

	// https://www.geeksforgeeks.org/maximum-subarray-size-subarrays-size-sum-less-k/

	public static void main(String[] args) {
		int[] A = {5,17,100,11 };
		int B = 130;
		System.out.println(solve(A, B));
	}

	private static int solve(int[] arr, int B) {

		// Variable declaration
		int n = arr.length;
		int ans = n;
		int sum = 0;
		int start = 0;

		// Loop till N
		for (int end = 0; end < n; end++) {

			// Sliding window from left
			sum += arr[end];

			while (sum > B) {

				// Sliding window from right
				sum -= arr[start];
				start++;

				// Storing sub-array size - 1
				// for which sum was greater than k
				ans = Math.min(ans, end - start + 1);

				// Sum will be 0 if start>end
				// because all elements are positive
				// start>end only when arr[end]>k i.e,
				// there is an array element with
				// value greater than k, so sub-array
				// sum cannot be less than k.
				if (sum == 0)
					break;
			}

			if (sum == 0) {
				ans = -1;
				break;
			}
		}

		// Print the answer
		return ans;
	}
}
