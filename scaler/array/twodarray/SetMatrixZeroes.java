package datastructures.src.com.scaler.array.twodarray;

import java.util.Arrays;

public class SetMatrixZeroes {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		solve(matrix);

		System.out.println(Arrays.deepToString(matrix));

	}

	public static void solve(int[][] matrix) {

		boolean isZeroesCol = false;
		boolean isZeroesRow = false;

		int row = matrix.length;
		int col = matrix[0].length;

		for (int i = 0; i < row; i++) { // check first col
			if (matrix[i][0] == 0) {
				isZeroesCol = true;
				break;
			}
		}

		for (int j = 0; j < col; j++) { // check first col
			if (matrix[0][j] == 0) {
				isZeroesRow = true;
				break;
			}
		}

		// check except first row & col

		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		// process except first row & col

		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		// handle first col

		if (isZeroesCol) {
			for (int i = 0; i < row; i++) {
				matrix[i][0] = 0;
			}
		}

		// handle first row

		if (isZeroesRow) {
			for (int j = 0; j < col; j++) {
				matrix[0][j] = 0;
			}
		}

	}
}
