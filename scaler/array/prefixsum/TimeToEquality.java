package datastructures.src.com.scaler.array.prefixsum;

public class TimeToEquality {

	public static void main(String[] args) {
		int[] A = { 2, 4, 1, 3, 2 };
//		int[] A = {1,2,3 };
		System.out.println(solve(A));
	}

	public static int solve(int[] A) {

		int max = A[0];
		int sum = A[0];
		int result = 0;
		for (int i = 1; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
			}
			sum += A[i];
		}
		result = A.length * max - sum;

		return result;

//		if (A.length == 0)
//			return 0;
//
//		int min = A[0];
//		for (int i = 0; i < A.length; i++)
//			min = Math.min(min, A[i]);
//		int res = 0;
//		for (int i = 0; i < A.length; i++)
//			res += A[i] - min;
//		return res;

	}

}
