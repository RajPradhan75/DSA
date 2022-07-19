package datastructures.src.com.scaler.array.subarray;

public class AmazingSubArrays {

	public static void main(String[] args) {
		String s = "ABEC";
		System.out.println(solve(s));

	}

	public static int solve(String A) {

		int x = 0;

		for (int i = 0; i < A.length(); i++) {

			char input = A.charAt(i);
			if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' || input == 'A'
					|| input == 'E' || input == 'I' || input == 'O' || input == 'U') {
				x += A.length() - i;
				x %= 10003;
			}

		}

		return x % 10003;
	}

}
