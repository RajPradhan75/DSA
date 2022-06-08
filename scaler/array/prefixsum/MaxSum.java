package datastructures.src.com.scaler.array.prefixsum;

public class MaxSum {

	public static void main(String[] args) {
		int[] C = { 5, -2, 3, 1, 2 };
		int A = C.length;
		int B = 3;
		System.out.println(maxSubarray(A, B, C));
	
	}

	public static int maxSubarray(int A, int B, int[] C) {
		int maxSum = 0;
		for (int i = 0; i < A; i++) {
			int sum = 0;
			for (int j = i; j < A; j++) {
				sum += C[j];
				if (sum <= B)
					maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;

	}
}
