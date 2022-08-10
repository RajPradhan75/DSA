package datastructures.src.com.scaler.advanced.arrays3;

public class MaximumAbsoluteDifference {

	public static void main(String[] args) {
		int[] A = { 1, 3, -1 };

		System.out.println(solve(A));
	}

	public static int solve(int[] A) {

		int min1 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE;
		int min2 = Integer.MAX_VALUE;
		int max2 = Integer.MIN_VALUE;

		for (int i = 0; i < A.length; i++) {

			max1 = Math.max(max1, A[i] + i);
			min1 = Math.min(min1, A[i] + i);
			max2 = Math.max(max2, A[i] - i);
			min2 = Math.min(min2, A[i] - i);
		}
		
		return Math.max(max1 - min1, max2 - min2);
	}

}
