package datastructures.src.com.scaler.advanced.bitsmanipulation2;

public class StrangeEquality {

	public static void main(String[] args) {
		int A = 5;
		System.out.println(solve(A));
	}

	private static int solve(int A) {

		int bit = 0, x = 0;

		while (A != 0) {
			if (A % 2 == 0) {
				x = x | (1 << bit);
			}
			A /= 2;
			bit++;
		}

		int y = (1 << bit);
		return x ^ y;

	}

}
