package datastructures.src.com.scaler.advanced.hashing1;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithZeroSum {
	public static void main(String[] args) {
		int[] A = {15, -2, 2, -8, 1, 7, 10, 23};
		System.out.println(solve(A));
	}

	private static int solve(int[] A) {

		int n = A.length;

		Map<Integer, Integer> hm = new HashMap<>();
		int sum = 0;


		for (int i = 0; i < n; i++) {

			sum += A[i];

			if (hm.containsKey(sum)) {
				return 1;
			} else {
				hm.put(sum, i);
			}

		}
		return 0;
	}
}
