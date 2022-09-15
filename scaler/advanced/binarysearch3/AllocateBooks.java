package datastructures.src.com.scaler.advanced.binarysearch3;

public class AllocateBooks {

	public static void main(String[] args) {
		int[] A = { 12, 34, 67, 90 };
		int B = 2;

		System.out.println(solve(A, B));
	}

	private static int solve(int[] A, int B) {

		if (B > A.length)
			return -1;

		int min = 0, max = 0, res = 0;
		for (int i = 0; i < A.length; i++) {
			min = Math.max(min, A[i]);
			max += A[i];
		}

		while (min <= max) {

			int mid = min + (max - min) / 2;

			if (isPossible(A, B, mid)) {
				res = mid;
				max = mid - 1;
			} else {
				min = mid + 1;
			}

		}

		return res;

	}

	private static boolean isPossible(int[] A, int B, int res) {
		int student = 1, sum = 0;

		for (int i = 0; i < A.length; i++) {
			if (sum + A[i] > res) {  // will have to increase student because can't give it to current student
				student++;
				sum = A[i];
			} else {
				sum += A[i];
			}
		}
		return student <= B;
	}

}
