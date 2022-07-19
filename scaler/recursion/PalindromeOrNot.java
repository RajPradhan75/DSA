package datastructures.src.com.scaler.recursion;

public class PalindromeOrNot {

	public static void main(String[] args) {

		String A = "naman";
		System.out.println(solve(A));

	}

	public static int solve(String A) {

		int n = A.length();

		int ans = Ispalindrome(A, 0, n - 1);

		return ans;

	}

	public static int Ispalindrome(String A, int s, int e) {

		if (s > e)
			return 1;

		if (A.charAt(s) == A.charAt(e))
			return Ispalindrome(A, s + 1, e - 1);
		else
			return 0;

	}

}
