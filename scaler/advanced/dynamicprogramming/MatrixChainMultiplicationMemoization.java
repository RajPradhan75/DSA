package datastructures.src.com.scaler.advanced.dynamicprogramming;

import java.util.Arrays;

public class MatrixChainMultiplicationMemoization {
	public static void main(String[] args) {

		int[] A = { 40, 20, 30, 10, 30 };
		int n = A.length;
		int[][] dp = new int[n][n];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}

		System.out.println(solve(A, 1, n - 1, dp));
	}

	public static int solve(int[] A, int i, int j, int[][] dp) {

		if (i >= j)
			return 0;

		if (dp[i][j] != -1)
			return dp[i][j];

		dp[i][j] = Integer.MAX_VALUE;

		for (int k = i; k <= j - 1; k++) {
			dp[i][j] = Math.min(dp[i][j], solve(A, i, k, dp) 
					+ solve(A, k + 1, j, dp) + A[i - 1] * A[k] * A[j]);
		}

		return dp[i][j];
	}
}
