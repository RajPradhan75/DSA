package datastructures.src.com.scaler.advanced.combinatorics;

public class ComputeCombinationFormula {

	public static void main(String[] args) {

		int A = 5;
		int B = 2;
		int C = 13;

		System.out.println(solve(A, B, C));
	}

	public static int solve(int A, int B, int C) {
		int v[][] = new int[A + 1][B + 1];
		for (int i = 0; i <= A; i++) {
			v[i][0] = 1;
		}
		for (int j = 1; j <= B; j++) {
			v[0][j] = 0;
		}
		for (int i = 1; i <= A; i++) {
			for (int j = Math.min(i, B); j > 0; j--) {
				v[i][j] = (v[i - 1][j] % C + v[i - 1][j - 1] % C) % C;
			}
		}
		return v[A][B] % C;
	}

}
