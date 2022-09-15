package datastructures.src.com.sample.arrays;

import java.util.HashMap;

public class CountPair {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 4, 2, 6 };
		int n = arr.length;
		int k = 8;
		int sum = getPairsCount(arr, n, k);
		System.out.println(sum);
	}

	static int getPairsCount(int[] arr, int n, int k) {
		HashMap<Integer, Integer> m = new HashMap<>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (m.containsKey(k - arr[i])) {
				count += m.get(k - arr[i]);
			}

			if (m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i]) + 1);
			} else {
				m.put(arr[i], 1);
			}
		}
		return count;
	}

}
