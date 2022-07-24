package datastructures.src.com.scaler.hashing;

import java.util.HashMap;

public class XORPair {

	public static void main(String[] args) {
		int[] A = { 5, 4, 10, 15, 7, 6 };
		int K = 5;

		System.out.println(solve(A, K));
	}

	public static int solve(int[] A, int k) {

		int result = 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		int current_xor = 0;

		for (int i = 0; i < A.length; i++) {

			current_xor = A[i] ^ k;

			if (map.containsKey(current_xor))
				result += map.get(current_xor);

			map.put(A[i], map.getOrDefault(A[i], 0) + 1);

		}

		return result;

	}
}
