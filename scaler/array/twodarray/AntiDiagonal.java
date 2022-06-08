package datastructures.src.com.scaler.array.twodarray;

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagonal {

	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
//
//		System.out.println("Input Array");
//		A.add(0, new ArrayList<>(Arrays.asList(1, 2, 3)));
//		A.add(1, new ArrayList<>(Arrays.asList(4, 5, 6)));
//		A.add(2, new ArrayList<>(Arrays.asList(7, 8, 9)));
//
//		System.out.println(A);
//
//		System.out.println();
//		System.out.println("Anti Diagonals");

//		A.get(1).add(0, 4);
//		A.get(1).add(1, 5);
//		A.get(1).add(2, 6);
//
//		A.get(2).add(0, 7);
//		A.get(2).add(1, 8);
//		A.get(2).add(2, 9);

		System.out.println( Arrays.deepToString(diagonal(A)));

	}

//	public static void solve(int[][] A) {
//
//		int N = 3;
//
//		int[][] result = new int[2 * A.length - 1][A.length];
//
//
//
//		for (int j = 0; j < N; j++) {
//			int y = j, x = 0;
//
//			while (y >= 0 && x < N) {
//				
//	
//
//				System.out.print(A[x][y] + " ");
//				y--;
//
//				x++;
//			}
//			System.out.println();
//		}
//		
//		 for (int row = 1; row < N; row++) {
//	            int startrow = row, startcol = N - 1;
//	 
//	            while (startrow < N && startcol >= 0) {
//	                System.out.print(A[startrow][startcol]
//	                                 + " ");
//	        
//	                startcol--;
//	 
//	                startrow++;
//	            }
//	            System.out.println();
//	        }
//	    
//	 
//
//
//	}

//	public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
//		int N = A.size(); // Number of row or columns of scoluare matrix
//		int total = 2 * N - 1; // Total number of anti-diagonals
//		ArrayList<ArrayList<Integer>> res = new ArrayList<>(N);
//
//		// Initializing all cells to 0
//		for (int i = 0; i < total; i++) {
//			res.add(new ArrayList<Integer>(N));
//			for (int j = 0; j < N; j++) {
//				res.get(i).add(0);
//			}
//		}
//
//		for (int i = 0; i < total; i++) {
//			if (i < N) { // Anti-digonals starting from first row
//				int x = 0, y = i;
//
//				while (x < N && y >= 0) {
//					int cellValue = A.get(x).get(y);
//					res.get(i).set(x, cellValue);
//					x++;
//					y--;
//				}
//			} else { // Anti-diagonals starting from last column
//				int x = i - N + 1, y = N - 1;
//
//				while (x < N && y >= 0) {
//					int cellValue = A.get(x).get(y);
//					res.get(i).set(N - i + x - 1, cellValue);
//					x++;
//					y--;
//				}
//			}
//		}
//
//		return res;
//	}

	public static int[][] diagonal(int[][] A) {

		int[][] res = new int[2 * A.length - 1][A.length];
		int k = 0;
		for (int j = 0; j < A.length; j++) {
			
			int row = 0;
			
			int col = j; int  m = 0;
			while (row < A.length && col >= 0) {

				res[k][m++] = A[row][col];
				row++;
				col--;
			}
	
			k++;
		}
		
		int j = A.length - 1;
		for (int i = 1; i < A.length; i++) {

			int col = j, m = 0, t = i;
			while (t < A.length && col >= 0) {
				res[k][m++] = A[t][col];
				t++;
				col--;
			}
	
			k++;
		}
		return res;

	}
}
