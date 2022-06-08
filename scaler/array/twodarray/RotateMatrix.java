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

		int[][] ans = new int[col][row];
	
		
		
//		Transpose
//		for (int j = 0; j < col; j++) {
//			for (int i = 0; i < row; i++) {
//				ans[j][i] = A[i][j];
//
//			}
//		}
		
		
		for(int j = 0; j<col ; j++) {
			for(int i = j+1 ; i< row ; i++) {
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
		}
		
		
		

		for(int i = 0; i<col ; i++) {
			int low = 0, high = row - 1;
			
			while(low <high) {
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
