package datastructures.src.com.scaler.advanced.binarysearch2;

public class SquareRootOfInteger {

	public static void main(String[] args) {

		int A = 11;
		System.out.println(solve(A));
	}

	private static int solve(int A) {

		// base case
	
			if (A == 0 || A == 1)
				return A;

		int start = 1;
		int end = A;
		int ans = 0;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (mid * mid == A)
				return mid;

			if (mid * mid < A) { // move closer to A
				start = mid + 1;
				ans = mid;
			} else {
				end = mid - 1;
			}
		}
		return ans;
	}

}
