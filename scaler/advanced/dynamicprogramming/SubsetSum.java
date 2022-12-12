package datastructures.src.com.scaler.advanced.dynamicprogramming;

public class SubsetSum {
	public static void main(String[] args) {

		int[] arr = { 3, 34, 4, 12, 5, 2 };
		int sum = 9;
		int N = arr.length;
		System.out.println(isSubset(N, arr, sum));

//		Output: true
//		Explanation: Here there exists a subset with
//		sum = 9, 4+3+2 = 9.
	}

	public static boolean isSubset(int N, int[] arr, int sum) {

		boolean dp[][] = new boolean[N + 1][sum + 1];

		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= sum; j++) {
				if (i == 0)
					dp[i][j] = false;
				if (j == 0)
					dp[i][j] = true;
			}
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= sum; j++) {
				if (arr[i - 1] <= j)
					dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
				else
					dp[i][j] = dp[i - 1][j];
			}
		}
		return dp[N][sum];
	}
}