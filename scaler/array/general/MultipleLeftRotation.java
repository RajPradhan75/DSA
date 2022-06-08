package datastructures.src.com.scaler.array.general;

import java.util.Arrays;

public class MultipleLeftRotation {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5 };
		int[] B = { 2, 3 };

		System.out.println(Arrays.deepToString(solve(A, B)));
	}

	public static int[][] solve(int[] A, int[] B) {

		int[][] out = new int[B.length][A.length];
		for (int i = 0; i < B.length; i++) {
			int temp[] = A.clone();
			int aSize = A.length;
			int nRotate = B[i] % aSize;
			array_rotate(temp, 0, aSize);
			array_rotate(temp, 0, aSize - nRotate);
			array_rotate(temp, aSize - nRotate, aSize);
			out[i] = temp.clone();
		}
		return out;
	}

	public static void array_rotate(int[] temp, int start, int end) {
		int i = start;
		int j = end - 1;
		while (i < j) {
			int buff = temp[i];
			temp[i] = temp[j];
			temp[j] = buff;
			i++;
			j--;
		}
	}

}
