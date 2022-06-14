package datastructures.src.com.scaler.array.subarray;

public class CountingSubArrays {

	public static void main(String[] args) {
		int[] A = { 2, 5, 6 };

		int B = 10;

		int n = A.length;
		System.out.println(solve(A, B, n));

	}

	public static int solve(int[] A, int B, int n) {

		// BruteForce Approach

//		int count = 0;
//
//		for (int i = 0; i < n; i++) {
//
//			int sum = 0;
//
//			for (int j = i; j < n; j++) {
//
//				if (sum + A[j] < B) {
//					sum += A[j];
//					count++;
//				} else
//					break;
//			}
//		}

		int start = 0, end = 0;
		int count = 0, sum = A[0];


		while (start < n && end < n) {

			// If sum is less than k,
			// move end by one position.
			// Update count and sum
			// accordingly.

			if (sum < B) {
				end++;

				if (end >= start)
					count += end - start;

				// For last element,
				// end may become n.
				if (end < n)
					sum += A[end];
			}

			// If sum is greater than or
			// equal to k, subtract
			// arr[start] from sum and
			// decrease sliding window by
			// moving start by one position
			else {
				sum -= A[start];
				start++;
			}
		}

		return count;

	}

}
