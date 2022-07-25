package datastructures.src.com.scaler.subsetandsubsequence;

public class LittlePonyandSubsequence {

	public static void main(String[] args) {
		String A = "ksdjgha";

		System.out.println(solve(A));
	}

	public static String solve(String A) {

		char minChar = 'z';

		char minChar1 = 'z';

		int n = A.length();

		int index = 0;

		for (int i = 0; i < n - 1; i++) {

			if (A.charAt(i) < minChar) {
				minChar = A.charAt(i);
				index = i;
			}
		}

		for (int i = index + 1; i < n; i++) {
			if (A.charAt(i) < minChar1) {
				minChar1 = A.charAt(i);
				index = i;
			}
		}

		String s1 = String.valueOf(minChar);
		String s2 = String.valueOf(minChar1);

		String result = s1.concat(s2);

		return result;

	}

}
