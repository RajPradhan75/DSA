package datastructures.src.com.scaler.advanced.dynamicprogramming;

public class LongestPalindromicSubstringRecursion {
	public static void main(String[] args) {
		String A = "aedsead";
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
		
		
		char[] X = A.toCharArray();
		char[] Y = B.toCharArray();
		
		if (n == 0 || m == 0)
			return 0;
		
		if (X[n - 1] == Y[m - 1])
			return 1 + solve(A, B, n - 1, m - 1);
		else
			return Math.max(solve(A, B, n, m - 1), 
					solve(A, B, n - 1, m));
	}
}
