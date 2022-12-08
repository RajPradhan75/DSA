package datastructures.src.com.scaler.advanced.backtracking;

import java.util.ArrayList;

public class NQueens {

	public static void main(String[] args) {
		int n = 4;
		System.out.println(solveNQueens(n));
	}

	public static ArrayList<ArrayList<String>> solveNQueens(int n) {
		ArrayList<ArrayList<String>> result = new ArrayList<>();
		if (n <= 0) {
			return result;
		}
		char[][] matrix = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = '.';
			}
		}
		nQueensDFSHelper(matrix, 0, result);
		return result;
	}

	private static void nQueensDFSHelper(char[][] matrix, int row, ArrayList<ArrayList<String>> result) {
		if (row == matrix.length) {
			ArrayList<String> possibleResult = resultBuilder(matrix);
			result.add(possibleResult);
			return;
		}
		for (int col = 0; col < matrix.length; col++) {
			matrix[row][col] = 'Q'; // mark the queen position to try out all the possibilities
			if (isValidPosition(matrix, row, col)) {
				nQueensDFSHelper(matrix, row + 1, result);
			}
			matrix[row][col] = '.'; // undo (un mark) the queen position
		}
	}

	private static boolean isValidPosition(char[][] matrix, int x, int y) {
		for (int row = 0; row < x; row++) { // check for the rows only before x as those are where the queen will be (as
											// we are visiting the rows in sequential order)
			for (int col = 0; col < matrix.length; col++) { // visit all the columns in these rows
				// when the matrix already has queen at [row, column] position, the new queen
				// cannot be in this column or one of its diagonals (x-row and y-col -- better
				// understood with an example: these conditions represents if the new queen is
				// placed in one of the diagonals of an already existing queen. if yes, the new
				// queen cannot be valid at the given position)
				if ((y == col || Math.abs(x - row) == Math.abs(y - col)) && matrix[row][col] == 'Q') { // NOTE :
																										// important
																	// to take care
																										// of it
					return false;
				}
			}
		}
		return true;
	}

	private static ArrayList<String> resultBuilder(char[][] matrix) {
		int length = matrix.length;
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			list.add(new String(matrix[i]));
		}
		return list;
	}

}
