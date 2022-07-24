package datastructures.src.com.scaler.modulararithmetic;

public class DivisibiltyByEight {

	public static void main(String[] args) {
		String A = "8888";

		System.out.println(solve(A));
	}

	public static int solve(String A) {

		int n = A.length();

		if (n == 0)
			return 0;

		if (n == 1) {
			if ((A.charAt(0) - '0') % 8 == 0) {
				return 1;
			} else {
				return 0;
			}
		}

		if (n == 2) {
			if (((A.charAt(n - 2) - '0') * 10 + (A.charAt(n - 1) - '0')) % 8 == 0)
				return 1;
			else
				return 0;
		}

		int last = A.charAt(n - 1) - '0';
		int secondLast = A.charAt(n - 2) - '0';
		int thirdLast = A.charAt(n - 3) - '0';

		if ((thirdLast * 100 + secondLast * 10 + last) % 8 == 0)
			return 1;

		return 0;
	}

}
