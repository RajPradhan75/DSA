package datastructures.src.com.scaler.bitmanipulation;

import java.util.Arrays;

public class SingleNumberIII {

	public static void main(String[] args) {
		int[] A = { 1, 2, 1, 3, 2, 5 };
		// Output: [3,5]

		System.out.println(Arrays.toString(solve(A)));
	}

	public static int[] solve(int[] A) {
		int[] res = { 0, 0 };
		int diff = 0;

		// Pass 1:
		// Xor all numbers

		for (int val : A) {
			diff ^= val;
		}

		// last set bit

		diff &= -diff;

		// Pass 2:

		for (int val : A) {
			if ((val & diff) == 0) // bit is off
				res[0] ^= val;
			else 				   // bit is on
				res[1] ^= val;
		}
		
		return res;
	}

}
