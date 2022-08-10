package datastructures.src.com.scaler.advanced.arrays2;

public class MaxSubMatrixSum {

	public static void main(String[] args) {

		int[][] A = { { -5, -4, -3 }, 
					  { -1, 2, 3 }, 
					  { 2, 2, 4 } };

		System.out.println(solve(A));
	}

	public static long solve(int[][] A) {
		long ans = Integer.MIN_VALUE;
		int n = A.length;
		int m = A[0].length;
		long[][] pf = new long[n][m];
		long sum = 0;
		
//CREATING PREFIX SUM ARRAY in reverse from bottom right cell N-1, M-1 AND finding the maximum pfsum
		for (int i = n - 1; i >= 0; i--) {
			sum = 0;
			for (int j = m - 1; j >= 0; j--) {
				sum = sum + A[i][j];
				pf[i][j] = sum;
			}
		}
		for (int j = m - 1; j >= 0; j--) {
			sum = 0;
			for (int i = n - 1; i >= 0; i--) {
				sum = sum + pf[i][j];
				pf[i][j] = sum;
				ans = Math.max(sum, ans);
			}
		}
		return ans;

	}

}
