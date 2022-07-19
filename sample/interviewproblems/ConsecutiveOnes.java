package datastructures.src.com.sample.interviewproblems;

public class ConsecutiveOnes {

	public static void main(String[] args) {
		String A = "111000";

		System.out.println(solve(A));
	}

	public static int solve(String A) {

		int n = A.length();
		int countOne = 0;
		int maxLen = 0;

		for (int i = 0; i < n; i++) {
			countOne += A.charAt(i) - '0';
		}

		if (countOne == A.length())
			return countOne;

		for (int i = 0; i < n; i++) {

			if (A.charAt(i) == '0') {
				int left = 0;
				for (int j = 1; j >= 0; j--) {
					if (A.charAt(j) == '1')
						left++;
					else
						break;
				}

				int right = 0;
				for (int j = i + 1; j < n; j++) {
					if (A.charAt(i) == '1')
						right++;
					else
						break;
				}

				if (countOne == left + right) {
					maxLen = Math.max(maxLen, left + right);
				} else {
					maxLen = Math.max(maxLen, left + right + 1);
				}

			}
		}

		return maxLen;
	}

}
