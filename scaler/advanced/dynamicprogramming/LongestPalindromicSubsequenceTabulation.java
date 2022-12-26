package datastructures.src.com.scaler.advanced.dynamicprogramming;

public class LongestPalindromicSubsequenceTabulation {

	public static void main(String[] args) {
		String A = "bebeeed";
		// The longest palindromic subsequence is "eeee", which has a length of 4.
		StringBuilder sb = new StringBuilder(A);
		sb.reverse();
		String B = sb.toString();
		int n = A.length();
		int m = B.length();

		System.out.println(solve(A, B, m, n));
	}

	public static int solve(String A, String B, int m, int n) {

		int[][] dp = new int[m + 1][n + 1];

		// Initialization

		for (int i = 0; i < m + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
			}
		}

		// choice diagram

		for (int i = 1; i < m + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (A.charAt(i - 1) == B.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[m][n];
	}
}
