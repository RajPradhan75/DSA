package datastructures.src.com.scaler.advanced.binarysearch2;

public class NthMagicalNumber {

	// https://leetcode.com/problems/nth-magical-number/discuss/1622336/JAVA-or-Binary-Search-or-Detailed-Explanation-Using-Image

	public static void main(String[] args) {
		int n = 4, a = 2, b = 3;
		System.out.println(solve(n, a, b));
	}

	private static int solve(int n, int a, int b) {

		long A = a, B = b;

		long mod = (long) (Math.pow(10, 9) + 7);

		long left = Math.min(a, b), 
				right = (long) n * Math.min(a, b);

		// find GCD

		while (B > 0) {
			long temp = A;
			A = B;
			B = temp % B;
		}

		long lcm = (a * b) / A;

		while (left <= right) {
			long mid = (left + right) / 2;

			if ((mid / a) + (mid / b) - (mid / lcm) < n)
				left = mid + 1;
			else
				right = mid - 1;
		}

		return (int) (left % mod);

	}
}
