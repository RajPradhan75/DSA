package datastructures.src.com.scaler.string;

public class ToUpper {

	public static void main(String[] args) {
		char[] A = { 'S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y' };

		System.out.println(solve(A));
	}

	public static char[] solve(char[] A) {

		for (int i = 0; i < A.length; i++) {

			if (A[i] >= 97 && A[i] <= 122) {

				int temp = A[i];

				A[i] = (char) (temp - 32);

			}

		}

		return A;
	}

}
