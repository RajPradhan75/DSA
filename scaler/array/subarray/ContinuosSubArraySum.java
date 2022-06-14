package datastructures.src.com.scaler.array.subarray;

import java.util.HashMap;

public class ContinuosSubArraySum {

	public static void main(String[] args) {
		int[] A = { 23, 2, 6, 4, 7 };
		int k = 7;
		System.out.println(solve(A, k));

	}

	public static boolean solve(int[] A, int k) {

		int[] prefixSum = new int[A.length];

		for (int i = 0; i < A.length; i++) {

			if (i == 0)
				prefixSum[i] = A[0];
			else
				prefixSum[i] = prefixSum[i - 1] + A[i];

		}

		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(0, -1);

		for (int i = 0; i < A.length; i++) {

			if (k != 0)
				prefixSum[i] %= k;
			System.out.print(prefixSum[i] %= k);
			System.out.print(" ");
			

			Integer prev = map.get(prefixSum[i]);

			if (prev != null) {
				if (i - prev > 1)
					return true;
			} else {
				map.put(prefixSum[i], i);
			}

		}
		return false;

	}

}
