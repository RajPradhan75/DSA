package datastructures.src.com.scaler.array.twodarray;

public class ColumnSum {

	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3, 4 }, 
					{ 5, 6, 7, 8 }, 
					{ 9, 2, 3, 4 } };
		System.out.println(	solve(A));
	
	}
	
	  public static int[] solve(int[][] A) {

	        int row = A.length;
	        int col = A[0].length;

	        int[] result = new int[A[0].length];
	   

	        for(int j = 0; j<col;j++){
	            int sum = 0;
	            for(int i = 0;i<row;i++){
	                sum += A[i][j];
	            }

	            result[j] =  sum;
	        }

	      return  result;
	    }

}
