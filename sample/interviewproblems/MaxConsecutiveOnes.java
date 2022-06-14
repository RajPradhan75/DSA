package datastructures.src.com.sample.interviewproblems;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {

		String A = "010100110101";

		System.out.println(solve(A));

	}

	public static int solve(String A) {

		char[] ch = new char[A.length()];

		for (int i = 0; i < A.length(); i++) {
			ch[i] = (char) (A.charAt(i) - '0');
		}

		int sum = 0, max = 0;

		for (int i = 0; i < ch.length; i++) {

			sum += ch[i];

			if (ch[i] == 0)
				sum = 0;
			else
				max = Math.max(max, sum);

		}

		return max;
	}

}
