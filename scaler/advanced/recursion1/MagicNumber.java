package datastructures.src.com.scaler.advanced.recursion1;

public class MagicNumber {

	public static void main(String[] args) {
		int A = 83557;
		System.out.println(solve(A));
	}

	public static int solve(int A) {

		return (solveRec(A) == 1 ? 1 : 0);
	}

	public static int solveRec(int A) {

		if (A < 10)
			return A;

		return solveRec(A % 10 + (solveRec(A / 10)));
	}

}
