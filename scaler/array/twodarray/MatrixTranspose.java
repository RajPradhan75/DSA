package datastructures.src.com.scaler.array.twodarray;

public class MatrixTranspose {
	
	public static void main(String[] args) {
		int [][]A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		System.out.println(solve(A));
	
	}
	
	
	
	   public static int[][] solve(int[][] A) {
		   
		   
		   int row= A.length; int col = A[0].length;
		   
		   int [][] ans = new int [col][row];
		   
		   for(int j = 0; j<col; j++) {
			   for(int i = 0; i<row; i++) {
				   ans[j][i] = A[i][j]; 
				   
			   }
		   }
		   
		   return ans;
	    }

}
