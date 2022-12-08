package datastructures.src.com.scaler.advanced.dynamicprogramming;

import java.util.Arrays;

public class UnboundedKnapsack {
	public static void main(String[] args) {

		int[] val = { 6, 7 };
		int[] weight = { 5, 5 };
		int wt = 10;
		int n = val.length;

		int[][] dp = new int[n + 1][wt + 1];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		System.out.println(knapsack(val, weight, wt, n, dp));
	}

	public static int knapsack(int[] val, int[] weight, int wt, int n, int[][] dp) {

		if (n == 0 || wt == 0)
			return 0;

		if (dp[n][wt] != -1)
			return dp[n][wt];

		if (weight[n - 1] <= wt) {
			return dp[n][wt] = Math.max(val[n - 1] + knapsack(val, weight, wt - weight[n - 1], n, dp),
					knapsack(val, weight, wt, n - 1, dp));

		} else if (weight[n - 1] > wt)
			return dp[n][wt] = knapsack(val, weight, wt, n - 1, dp);

		return 0;

	}	
}
