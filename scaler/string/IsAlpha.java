package datastructures.src.com.scaler.string;

public class IsAlpha {

	public static void main(String[] args) {

		char[] A = { 'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0' };

		System.out.println(solve(A));
	}

	public static int solve(char[] A) {

		int count = 0;

		for (int i = 0; i < A.length; i++) {

			if (A[i] >= 65 && A[i] <= 90 || A[i] >= 97 && A[i] <= 122)
				count++;

		}
		
		if(count == A.length) return 1;

		return 0;

	}

}
