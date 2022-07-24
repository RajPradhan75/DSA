package datastructures.src.com.scaler.modulararithmetic;

import java.util.Arrays;

public class ConcatenateThreeNumbers {

	public static void main(String[] args) {
		int A = 55;
		int B = 43;
		int C = 47;

		System.out.println(solve(A, B, C));
	}

	public static int solve(int A, int B, int C) {

		int min = Math.min(A, Math.min(B, C));

		int max = Math.max(A, Math.max(B, C));

		int mid = A ^ B ^ C ^ min ^ max;
		
		return (min * 10000) + (mid * 100) + max;

	}

}
