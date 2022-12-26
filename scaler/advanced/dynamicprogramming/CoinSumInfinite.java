package datastructures.src.com.scaler.advanced.dynamicprogramming;

import java.util.Arrays;

public class CoinSumInfinite {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3 };
		int B = 4;
		System.out.println(solve(A, B));
	}

	public static int solve(int[] arr, int sum) {

//		int N = arr.length;
//		int [][]dp = new int[N + 1][sum + 1];
//
//		for (int i = 0; i <= N; i++) {
//			for (int j = 0; j <= sum; j++) {
//				if (i == 0)
//					dp[i][j] = 0;
//				if (j == 0)
//					dp[i][j] = 1;
//			}
//		}
//
//		for (int i = 1; i <= N; i++) {
//			for (int j = 1; j <= sum; j++) {
//				if (arr[i - 1] <= j)
//					dp[i][j] = (dp[i][j - arr[i - 1]] + dp[i - 1][j]);
//				else
//					dp[i][j] = dp[i - 1][j];
//			}
//		}
//		return dp[N][sum];
		
		
		    int[] num_ways = new int[sum + 1];
	        int Mod = 1000000 + 7;
	        int i, j, n = arr.length;
	        Arrays.fill(num_ways, 0);
	        num_ways[0] = 1; // only one way to make sum as 0

	        for (i = 0; i < n; i++) {
	            for (j = arr[i]; j <= sum; j++) {
	                num_ways[j] += num_ways[j - arr[i]];
	                num_ways[j] %= Mod;
	            }
	        }
	        return num_ways[sum];
	}

}
