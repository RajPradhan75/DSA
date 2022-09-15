package datastructures.src.com.scaler.advanced.recursion1;

public class PowerFunction {

	public static void main(String[] args) {
		int A = 2, B = 3, C = 3;
		System.out.println(solve(A, B, C));
	}

	public static int solve(int A, int B, int C) {
		int ans = pow(A, B, C);

		return ans;
	}

	public static int pow(int A, int B, int C) {

		if (A == 0)
			return 0;

		if (B == 0)
			return 1;

		long halfPow = (long) pow(A, B / 2, C);

		if (B % 2 == 0)
			return (int) ((halfPow % C * halfPow % C) + C) % C;
		else
			return (int) ((halfPow % C * halfPow % C * A % C) + C) % C;

	}

}
