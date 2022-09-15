package datastructures.src.com.scaler.advanced.arrays2;

public class SumOfAllSubmatrices {

	public static void main(String[] args) {
		int[][] A = { { 1, 1 }, { 1, 1 } };

//		Number of submatrices with 1 elements = 4, so sum of all such submatrices = 4 * 1 = 4
//				Number of submatrices with 2 elements = 4, so sum of all such submatrices = 4 * 2 = 8
//				Number of submatrices with 3 elements = 0
//				Number of submatrices with 4 elements = 1, so sum of such submatrix = 4
//				Total Sum = 4+8+4 = 16

		System.out.println(solve(A));

	}

	public static int solve(int[][] A) {

		int n = A.length;

		int sum = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				int contribution = (i + 1) * (j + 1) * (n - i) * (n - j);

				sum += A[i][j] * contribution;

			}
		}

		return sum;

	}

}
