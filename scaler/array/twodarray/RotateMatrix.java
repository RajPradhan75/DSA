package datastructures.src.com.scaler.array.twodarray;

import java.util.Arrays;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] A = { { 1, 2 }, { 3, 4 } };
		System.out.println(Arrays.deepToString(solve(A)));

	}

	public static int[][] solve(int[][] A) {

		int row = A.length;
		int col = A[0].length;
		
		int n = row;

//		for (int j = 0; j < col; j++) { // transpose
//			for (int i = j + 1; i < row; i++) {
//				int temp = A[i][j];
//				A[i][j] = A[j][i];
//				A[j][i] = temp;
//			}
//		}
		   for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                int tmp = A[j][i];
	                A[j][i] = A[i][j];
	                A[i][j] = tmp;
	            }
	        }

		for (int i = 0; i < col; i++) { // reverse the row elements
			int low = 0, high = row - 1;

			while (low < high) {
				int temp = A[i][low];
				A[i][low] = A[i][high];
				A[i][high] = temp;
				low++;
				high--;
			}
		}

		return A;
	}

}
