package datastructures.src.com.scaler.advanced.dynamicprogramming;

public class MatrixChainMultiplication {

	public static void main(String[] args) {

		int[] A = { 40, 20, 30, 10, 30 };
		int n = A.length;

		System.out.println(solve(A, 1, n - 1));
	}

	public static int solve(int[] A, int i, int j) {

		int min = Integer.MAX_VALUE;

		if (i >= j)
			return 0;

//		if (i == j)
//			return 0;
		// At i == j the cost is zero not because there's only one element in the array.
		// It'll be because there's no other matrix to which the remaining matrix will
		// be multiplied

//Ex. [10, 20]
//Here i = 1, and j = 1. So, there's only one matrix in the array and no other matrix to which this matrix can be multiplied. So, there will be no multiplication, hence the cost of multiplication becomes zero

		for (int k = i; k <= j - 1; k++) {
			int tempAns = solve(A, i, k) + solve(A, k + 1, j)
			     +A[i-1] * A[k] * A[j];

			if (tempAns < min) {
				min = tempAns;
			}
		}

		return min;

	}
}
