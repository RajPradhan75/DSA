package datastructures.src.com.scaler.advanced.dynamicprogramming;

public class Knapsack01OneDArray {
	public static void main(String[] args) {
		int[] val = { 60, 100, 120 };
		int[] wt = { 10, 20, 30 };
		int W = 50;
		int n = val.length;
		int[] dp = new int[W + 1];

		// Taking items with weight
		// 20 and 30 will give us the maximum value i.e 100 + 120 = 220
		System.out.println(knapsack(val, wt, W, n, dp));
	}

	public static int knapsack(int[] val, int[] wt, int W, int n, int[] dp) {

		for (int i = 0; i < n; i++) {
			for (int w = W; w >= 0; w--) {
				if (wt[i] > w) {
					continue;
				}
				dp[w] = Math.max(dp[w], dp[w - wt[i]] + val[i]);
			}
		}
		return dp[W];
		
		// Time Complexity: O(N * W). As redundant calculations of states are avoided
		// Auxiliary Space: O(W) As we are using a 1-D array instead of a 2-D array
	}
}
