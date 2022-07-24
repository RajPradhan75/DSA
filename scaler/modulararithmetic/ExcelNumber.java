package datastructures.src.com.scaler.modulararithmetic;

public class ExcelNumber {

	public static void main(String[] args) {
		String A = "AB";

		System.out.println(solve(A));
	}

	public static int solve(String A) {

		if (A == null)
			return -1;

		int sum = 0;

		for (char c : A.toUpperCase().toCharArray()) {

			sum *= 26;

			sum += c - 'A' + 1;

		}

		return sum;

	}

}
