package datastructures.src.com.scaler.advanced.dynamicprogramming;

public class UniquePath {

//	Input: m = 3, n = 2
//			Output: 3
//			Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
//			1. Right -> Down -> Down
//			2. Down -> Down -> Right
//			3. Down -> Right -> Down

	public static void main(String[] args) {

		int m = 3, n = 2;
		System.out.println(solve(m, n));
	}

	public static int solve(int m, int n) {

		int[][] dp = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 1;
				else
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];

			}
		}

		return dp[m - 1][n - 1];

	}

}
