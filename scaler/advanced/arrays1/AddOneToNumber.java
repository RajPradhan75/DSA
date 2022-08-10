package datastructures.src.com.scaler.advanced.arrays1;

import java.util.Arrays;

public class AddOneToNumber {

	public static void main(String[] args) {
//		int[] A = { 1, 2, 3 };
		int[] A = {9,9,9 };
//		int[] A = { 0 };

		System.out.println(Arrays.toString(solve(A)));
	}

	public static int[] solve(int[] A) {

		
		int n = A.length;
	    for(int i=n-1; i>=0; i--) {
	        if(A[i] < 9) {
	            A[i]++;
	            return A;
	        }
	        
	        A[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    
	    return newNumber;
	}

}
