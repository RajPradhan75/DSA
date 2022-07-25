package datastructures.src.com.scaler.hashing;

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {

		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' }

		};
//		String[] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
//				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
//				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
//				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
//				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
//				
//		};

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

	// scaler
	public static int solve(String [] A) {

		int m = A.length; // rows
		int n = A[0].length(); // columns

		// check if every row has unique elements
		for (String s : A) {
			HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
			for (int i = 0; i < n; i++) {
				char ch = s.charAt(i);
				if (Character.isDigit(ch) && map.containsKey(ch))
					return 0;
				else
					map.put(ch, true);
			}
		}

		// check if every column has unique elements
		for (int i = 0; i < m; i++) {
			HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
			for (String s : A) {
				char ch = s.charAt(i);
				if (Character.isDigit(ch) && map.containsKey(ch))
					return 0;
				else
					map.put(ch, true);
			}
		}

		// check box
		int rows[] = { 0, 3, 6 };
		int columns[] = { 0, 3, 6 };
		for (int r : rows) {
			for (int c : columns) {
				HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
				for (int r1 = r; r1 < r + 3; r1++) {
					for (int c1 = c; c1 < c + 3; c1++) {
						char ch = A[r1].charAt(c1);
						if (Character.isDigit(ch) && map.containsKey(ch))
							return 0;
						else
							map.put(ch, true);
					}
				}
			}
		}
		return 1;
	}

}
