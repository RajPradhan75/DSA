package datastructures.src.com.scaler.advanced.dynamicprogramming;

import java.util.Arrays;

public class RodCutting {

	public static void main(String[] args) {
		int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
		int n = price.length;
		int max_length = n;
		int length[] = new int[n];
		for (int i = 0; i < n; i++) {
			length[i] = i + 1;
		}
		int[][] dp = new int[n + 1][n + 1];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		System.out.println(knapsack(price, length, n, max_length, dp));
	}

	public static int knapsack(int[] price, int[] length, int n, int max_length, int[][] dp) {

		if (max_length == 0 || n == 0)
			return 0;

		if (dp[max_length][n] != -1)
			return dp[max_length][n];

		if (length[max_length - 1] <= n) {
			return dp[max_length][n] = Math.max(
					price[max_length - 1] + knapsack(price, length, n - length[max_length - 1], max_length, dp),
					knapsack(price, length, n, max_length - 1, dp));

		} else if (length[max_length - 1] > n)
			return dp[max_length][n] = knapsack(price, length, n, max_length - 1, dp);

		return 0;

	}

}
