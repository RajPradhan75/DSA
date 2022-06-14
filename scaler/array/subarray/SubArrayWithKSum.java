package datastructures.src.com.scaler.array.subarray;

import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;

public class SubArrayWithKSum {

	public static void main(String[] args) {

		int[] A = { 1, 2, 3 };
//		int [] A = {1,1,1};

		int k = 3;

		System.out.println(solve(A, k));

	}

	public static int solve(int[] A, int k) {

		int count = 0;

		int[] prefixSum = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			if (i == 0)
				prefixSum[i] = A[0];
			else
				prefixSum[i] = prefixSum[i - 1] + A[i];
		}

		System.out.println("Prefix Sum: " + Arrays.toString(prefixSum));

		Map<Integer, Integer> map = new HashMap<>();

		map.put(0, 1);
		for (int i = 0; i < A.length; i++) {

			if (map.containsKey(prefixSum[i] - k))
				count += map.get(prefixSum[i] - k);

			map.put(prefixSum[i], map.getOrDefault(prefixSum[i], 0) + 1);

		}

		return count;
	}

}
