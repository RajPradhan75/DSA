package datastructures.src.com.scaler.advanced.hashing1;

import java.util.HashSet;

public class CheckPalindrome2 {

	public static void main(String[] args) {

//		String A = "abbaee";
		String A = "abca";
//		System.out.println(solve(A));

		System.out.println(validPalindrome(A));
	}

	private static int solve(String A) {

		char[] B = A.toCharArray();
		HashSet<Character> hashSet = new HashSet<Character>();
		for (char a : B) {
			if (hashSet.contains(a))
				hashSet.remove(a);
			else
				hashSet.add(a);
		}

		if ((B.length & 1) == hashSet.size())
			return 1;
		return 0;
	}

	private static boolean validPalindrome(String s) {

		int i = 0, j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
			i++;
			j--;
		}
		return true;
	}

	private static boolean isPalindrome(String s, int i, int j) {

		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
