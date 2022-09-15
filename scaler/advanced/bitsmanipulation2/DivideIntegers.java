package datastructures.src.com.scaler.advanced.bitsmanipulation2;

public class DivideIntegers {

	public static void main(String[] args) {
		int A = 15;
		int B = 2;

		System.out.println(solve(A, B));
	}

	private static int solve(int A, int B) {
		if (A == 1 << 31 && B == -1)
			return (1 << 31) - 1;
		int a = Math.abs(A), b = Math.abs(B), res = 0;
		for (int x = 31; x >= 0; x--)
			if ((a >>> x) - b >= 0) {
				res += 1 << x;
				a -= b << x;
			}
		return (A > 0) == (B > 0) ? res : -res;
	}

}
