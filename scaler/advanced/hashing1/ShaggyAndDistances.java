package datastructures.src.com.scaler.advanced.hashing1;

import java.util.HashMap;
import java.util.Map;

public class ShaggyAndDistances {

	public static void main(String[] args) {
		int[] A = { 7, 1, 3, 4, 1, 7 };
		System.out.println(solve(A));
	}

	private static int solve(int[] A) {

		int N = A.length;

		int diff = Integer.MAX_VALUE;

		Map<Integer, Integer> costMap = new HashMap<>();

		for (int i = 0; i < N; i++) {
			if (!costMap.containsKey(A[i])) {
				costMap.put(A[i], i);
			} else {
				int j = costMap.get(A[i]);
				if (diff > (i - j)) {

					diff = i - j;

				}
			}
		}

		if (diff == Integer.MAX_VALUE) {
			return -1;
		}
		return diff;

	}

}
