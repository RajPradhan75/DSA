package datastructures.src.com.scaler.recursion;

public class KthSymbol {

	public static void main(String[] args) {

		int A = 4, B = 3;

		System.out.println(solve(A, B));
	}

	public static int solve(int A, int B) {

		if (A == 1)
			return 0;

		if (B % 2 == 0)
			return (solve(A - 1, B / 2) == 0) ? 1 : 0;
		else {
			return (solve(A - 1, (B + 1) / 2) == 0) ? 0 : 1;
		}

	}

}
