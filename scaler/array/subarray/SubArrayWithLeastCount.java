package datastructures.src.com.scaler.array.subarray;

public class SubArrayWithLeastCount {

	public static void main(String[] args) {

		int[] A = { 3, 7, 90, 20, 10, 50, 40 };
		int B = 3;

		System.out.println(solve(A, B));
	}

	public static int solve(int[] A, int B) {

		int n = A.length;

		// k must be smaller than or equal to n
		if (n < B)
			return -1;

		// Initialize beginning index of result
		int res_index = 0;

		// Compute sum of first subarray of size B
		int curr_sum = 0;
		for (int i = 0; i < B; i++)
			curr_sum += A[i];

		// Initialize minimum sum as current sum
		int min_sum = curr_sum;

		// Traverse from (k+1)'th element to n'th element
		for (int i = B; i < n; i++) {
			// Add current item and remove first
			// item of previous subarray
			curr_sum += A[i] - A[i - B];

			// Update result if needed
			if (curr_sum < min_sum) {
				min_sum = curr_sum;
				res_index = (i - B + 1);
			}
		}
		return res_index;
	}

}
