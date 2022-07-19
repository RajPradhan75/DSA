package datastructures.src.com.scaler.array.prefixsum;

import java.util.Arrays;

public class ProductArrayPuzzle {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(solve(A)));
	
	}

	public static int[] solve(int[] A) {

		int[] prefix_sum = new int[A.length];

		for (int i = 0; i < A.length; i++) {

			if (i == 0)
				prefix_sum[i] = A[i];
			else
				prefix_sum[i] = prefix_sum[i - 1] * A[i];

		}

		int productSum = prefix_sum[A.length - 1];

		int[] result = new int[A.length];

		for (int i = 0; i < A.length; i++) {

			result[i] =  productSum/A[i];

		}

		return result;

	}

}
