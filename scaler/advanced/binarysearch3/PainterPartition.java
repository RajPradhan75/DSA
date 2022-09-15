package datastructures.src.com.scaler.advanced.binarysearch3;

public class PainterPartition {

	public static void main(String[] args) {
		int A = 3;
		int B = 10;
		int[] C = { 185, 186, 938, 558, 655, 461, 441, 234, 902, 681 };

		System.out.println(solve(A, B, C));
	}

	private static int solve(int A, int B, int[] C) {

		long min = 0;
		long max = 0;
		long res = 0;

		for (int i = 0; i < C.length; i++) {
			min = Math.max(min, C[i]);
			max += C[i];
		}

		long left = min * B;
		long right = max * B;

		while (left <= right) {
			long mid = left + (right - left) / 2;

			if (isPossible(A, B, C, mid)) {
				res = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}
		return (int) res % 10000003;

	}

	private static boolean isPossible(long A, long B, int[] C, long res) {

		long painter = 1, sum = 0;

		for (int i = 0; i < C.length; i++) {
			if (sum + C[i] * B > res) { // will have to increase painters because can't give it to current student
				painter++;
				sum = C[i] * B;
			} else {
				sum += C[i] * B;
			}
		}

		if (painter <= A)
			return true;
		else
			return false;

	}

}
