package datastructures.src.com.scaler.advanced.twopointers;

import java.util.Arrays;

public class TwoSum2 {

	public static void main(String[] args) {
		int[] A = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println( Arrays.toString(solve(A, target)));
	}

	private static int[] solve(int[] A, int target) {

		int i = 0, j = A.length - 1;

		int num1, num2 = 0;

		while (i < j) {
			num1 = A[i];
			num2 = A[j];

			if (num1 + num2 == target)
				break;

			if (num1 + num2 < target) {
				i++;
				continue;
			} else {
				j--;
			}

		}
		return new int[] {i+1, j+1};

	}
}
