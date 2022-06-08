package datastructures.src.com.sample.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 4, 2 };
		int n = arr.length;
		int k = 8;
		int sum[] = getPairsCount(arr, n, k);
		System.out.println(Arrays.toString(sum));
	}

	static int[] getPairsCount(int[] arr, int n, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(k - arr[i])) {
				return new int[] { i, map.get(k - arr[i]) };
			}

			map.put(arr[i], i);
		}

		return new int[0];

	}

}
