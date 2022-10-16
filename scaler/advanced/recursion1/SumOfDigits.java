package datastructures.src.com.scaler.advanced.recursion1;

public class SumOfDigits {

	public static void main(String[] args) {
		int A = 46;

		System.out.println(solve(A));
	}

	public static int solve(int A) {

		if (A < 10)
			return A;

		return (A % 10 + (solve(A / 10)));

	}

}
