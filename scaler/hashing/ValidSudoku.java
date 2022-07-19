package datastructures.src.com.scaler.hashing;

import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {

		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' }

		};

		System.out.println(solve(board));
	}

	public static int solve(char[][] board) {

		HashSet<String> seen = new HashSet<>();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; i++) {
				char number = board[i][j];

				if (number != '.') {
					if (!seen.add(number + "in row" + i));
					if (!seen.add(number + "in column" + j));
					if (!seen.add(number + "in block" + i / 3 + '-' + j / 3));
					return 0;
				}
			}
		}

		return 1;

	}

}
