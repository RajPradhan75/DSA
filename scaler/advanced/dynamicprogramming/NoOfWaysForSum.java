package datastructures.src.com.scaler.advanced.dynamicprogramming;

public class NoOfWaysForSum {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(countWays(n));
	}

	public static int countWays(int n) {

		int[] dp = new int[n + 1];
		dp[0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= Math.min(i, n); j++) {
				dp[i] += dp[i - j];
			}
		}
		return dp[n];
	}
}
