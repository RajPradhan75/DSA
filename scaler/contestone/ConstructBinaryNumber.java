package datastructures.src.com.scaler.contestone;

import java.util.Arrays;

public class ConstructBinaryNumber {

	public static void main(String[] args) {
		int A = 6;
		int B = 2;

		System.out.println(solve(A, B));
	}

	public static int solve(int A, int B) {

		int decimalValue = 0;
		int base = 1;

		int n = A + B;
		int[] binaryNum = new int[n];

		for (int i = 0; i < A; i++) {
			binaryNum[i] = 1;
		}


		System.out.println(Arrays.toString(binaryNum));
		
		for (int i = n - 1; i >= 0; i--) {
			
			if (binaryNum[i] == 1)
				decimalValue += base;
			    base = base * 2;
		}

		return decimalValue;

	}

}
