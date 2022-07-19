package datastructures.src.com.scaler.array.modulararithmetic;

public class ModString {

	public static void main(String[] args) {
		String A = "143";
		int B = 2;

		System.out.println(solve(A,B));
	}

	public static int solve(String A, int B) {

		int num, rem = 0;

		for (int i = 0; i < A.length(); i++) {

			num = rem * 10 + (A.charAt(i) - '0');
			rem = num % B;

		}

		return rem;
	}

}
