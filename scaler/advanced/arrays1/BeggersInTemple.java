package datastructures.src.com.scaler.advanced.arrays1;

import java.util.Arrays;

public class BeggersInTemple {

	public static void main(String[] args) {
		int A = 5;

		int[][] B = { { 1, 2, 10 }, { 2, 3, 20 }, { 2, 5, 25 } };

		System.out.println(Arrays.toString(solve(A, B)));
	}

	public static int[] solve(int A, int[][] B) {

//		int[] output = new int[A];
//		
//		//Brute force
//		for (int i = 0; i < B.length; i++) {
//			int amount = B[i][2];
//
//			for (int j = B[i][0] - 1; j < B[i][1]; j++) {
//				output[j] += amount;
//			}
//
//		}
//
//		return output;

		int[] coin = new int[A];

		for (int i = 0; i < B.length; i++) {
			int leftIndex = B[i][0] - 1;
			int rightIndex = B[i][1] - 1;
			int amount = B[i][2];
			coin[leftIndex] += amount;

			if ((rightIndex + 1 < A))
				coin[rightIndex + 1] -= amount;
		}

		for (int i = 1; i < A; i++) {
			coin[i] = coin[i - 1] + coin[i];
		}

		return coin;

	}
}
