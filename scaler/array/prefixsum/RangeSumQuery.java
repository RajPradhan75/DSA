package datastructures.src.com.scaler.array.prefixsum;

import java.util.Arrays;

public class RangeSumQuery {

//A = [1, 2, 3, 4, 5]
// B = [[1, 4], [2, 3]]

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5 };
		int[][] B = { { 1, 4 }, { 2, 3 } };
		
	
		System.out.println(Arrays.toString(rangeSum(A, B)));

	}

	public static long[] rangeSum(int[] A, int[][] B) {

		long[] prefix_sum = new long[A.length];

		prefix_sum[0] = A[0];

		for (int i = 1; i < A.length; i++) {

			prefix_sum[i] = prefix_sum[i - 1] + A[i];

		}

		long[] output_arr = new long[B.length];

		for (int i = 0; i < B.length; i++) {
			int l = B[i][0];
			int r = B[i][1];

			if (l - 2 < 0) {
				output_arr[i] = prefix_sum[r - 1];
			} else {
				output_arr[i] = prefix_sum[r - 1] - prefix_sum[l - 2]; // for 3 and 5=> 4 - 1 = 10 - 3
			}

		}
		return output_arr;
	}
}
