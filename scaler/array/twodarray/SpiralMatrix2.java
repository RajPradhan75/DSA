package datastructures.src.com.scaler.array.twodarray;

import java.util.Arrays;

public class SpiralMatrix2 {
	
	
	public static void main(String[] args) {
		int A = 3;

		System.out.println(Arrays.deepToString(generateMatrix(A)));
		
	}
	
	
	 public static int[][] generateMatrix(int A) {
	        int[][] matrix = new int[A][A];
	        
	        // Edge Case
	        if (A == 0) {
	            return matrix;
	        }
	        
	        // Normal Case
	        int rowStart = 0;
	        int rowEnd = A-1;
	        int colStart = 0;
	        int colEnd = A-1;
	        int num = 1; //change
	        
	        while (rowStart <= rowEnd && colStart <= colEnd) {
	            for (int i = colStart; i <= colEnd; i ++) {
	                matrix[rowStart][i] = num ++; //change
	            }
	            rowStart ++;
	            
	            for (int i = rowStart; i <= rowEnd; i ++) {
	                matrix[i][colEnd] = num ++; //change
	            }
	            colEnd --;
	            
	            for (int i = colEnd; i >= colStart; i --) {
//	                if (rowStart <= rowEnd)
	                    matrix[rowEnd][i] = num ++; //change
	            }
	            rowEnd --;
	            
	            for (int i = rowEnd; i >= rowStart; i --) {
//	                if (colStart <= colEnd)
	                    matrix[i][colStart] = num ++; //change
	            }
	            colStart ++;
	        }
	        
	        return matrix;
	    }

}
