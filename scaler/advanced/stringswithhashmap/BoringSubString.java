package datastructures.src.com.scaler.advanced.stringswithhashmap;

public class BoringSubString {
	public static void main(String[] args) {
		String A = "abcd";
		System.out.println(solve(A));
	}

	private static int solve(String A) {
		int emin = Integer.MAX_VALUE;
		int emax = Integer.MIN_VALUE;
		int omin = Integer.MAX_VALUE;
		int omax = Integer.MIN_VALUE;

		for (int i = 0; i < A.length(); i++) {
			int val = A.charAt(i);
			if ((val % 2) == 0) {
				emin = Math.min(val, emin);
				emax = Math.max(val, emax);
			} else {
				omin = Math.min(val, omin);
				omax = Math.max(val, omax);
			}
		}

		if (Math.abs(emin - omax) != 1 || Math.abs(emin - omin) != 1 || Math.abs(omin - emax) != 1
				|| Math.abs(omax - emax) != 1) {
			return 1;
		}

		return 0;
	}
}
