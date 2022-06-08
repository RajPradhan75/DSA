package datastructures.src.com.scaler.array.twodarray;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {

		int[][] A = { { 1, 2 }, { 3, 4 },

		};
		int[][] B = { { 5, 6 }, { 7, 8 },

		};
		System.out.println(Arrays.toString(solve(A, B)));

	}

	public static int[][] solve(int[][] A, int[][] B) {

		int row1 = A.length;
		int col1 = A[0].length;
		int row2 = B.length;
		int col2 = B[0].length;



		int[][] prod = new int[row1][col2];

		for (int i = 0; i < prod.length; i++) {
			for (int j = 0; j < prod[0].length; j++) {
				for (int k = 0; k < col1; k++) {
					prod[i][j] += A[i][k] * B[k][j];
				}
			}
		}

		return prod;

	}

}
