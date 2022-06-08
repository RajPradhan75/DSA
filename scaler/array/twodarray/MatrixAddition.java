package datastructures.src.com.scaler.array.twodarray;

import java.util.Arrays;

public class MatrixAddition {
	
	public static void main(String[] args) {
		int[][] A = { {-5, 7 }, 
			      { 3, 1 }, 
			      { 4, -10} 
			      };
	int[][] B = { { 3, 4 }, 
			      { 2, 3 },
			      { 10, 1 } 
			      };
	System.out.println(Arrays.toString(solve(A, B)));
	}
	
	public static int[][] solve(int[][] A, int[][] B) {

		int[][] result = new int[A.length][B[0].length];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				result[i][j] = A[i][j] + B[i][j];
			}
		}
		


		return result;

	}

}
