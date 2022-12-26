package datastructures.src.com.scaler.advanced.dynamicprogramming;

import java.util.Arrays;

public class LongestPalindromicSubsequenceMemoization {

	static int[][] dp = new int[1001][1001];

	public static void main(String[] args) {

		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}

		String A = "bbbab";
//		The longest palindromic subsequence is "aedea", which has a length of 5.
		StringBuilder sb = new StringBuilder(A);
		sb.reverse();
		String B = sb.toString();
		int n = A.length();
		int m = B.length();
		System.out.println(A);
		System.out.println(B);
		System.out.println(solve(A, B, n, m));

	}

	public static int solve(String A, String B, int n, int m) {

//		char[] X = A.toCharArray();
//		char[] Y = B.toCharArray();

		if (n == 0 || m == 0)
			return 0;

		if (dp[n][m] != -1)
			return dp[n][m];

		if (A.charAt(n - 1) == B.charAt(m - 1))
			return dp[n][m] = 1 + solve(A, B, n - 1, m - 1);
		else
			return dp[n][m] = Math.max(solve(A, B, n, m - 1), solve(A, B, n - 1, m));

	}

	// Leetcode solution
//	class Solution {
//	    static int[][] dp = new int[1001][1001];
//	    public int longestPalindromeSubseq(String A) {
//
//	        for(int i = 0 ; i<dp.length;i++){
//	            Arrays.fill(dp[i], - 1);
//	        }
//	        
//	        StringBuilder sb = new StringBuilder(A);
//	        sb.reverse();
//	        String B = sb.toString();
//	        int m = A.length();
//	        int n = B.length();
//	        return lcs(A,B,m,n,dp);
//
//	    }
//
//	     public  int lcs(String A, String B, int m, int n,int [][]dp){
//
//	         if(m == 0 || n == 0)
//	            return 0;
//
//	         if(dp[m][n] != -1)
//	            return dp[m][n];
//
//	         if(A.charAt(m - 1) == B.charAt(n - 1)){
//	             return dp[m][n] =  1 + lcs(A,B,m-1,n-1,dp);
//	         }else{
//	             return dp[m][n] = Math.max(lcs(A,B,m-1,n,dp) , lcs(A,B,m,n-1,dp));
//	         }
//	    }
//	}

}
