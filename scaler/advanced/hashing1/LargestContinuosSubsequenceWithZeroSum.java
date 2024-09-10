package datastructures.src.com.scaler.advanced.hashing1;

import java.util.Arrays;
import java.util.HashMap;

public class LargestContinuosSubsequenceWithZeroSum {
	public static void main(String[] args) {
		int[] A = { 15, -2, 2, -8, 1, 7, 10, 23 };
		System.out.println(Arrays.toString(solve(A)));
	}

	private static int[] solve(int[] A) {
		int len = A.length;
		int answer = 0;

		// Building the prefix array.
		int[] pf = new int[len];
		pf[0] = A[0];
		for (int i = 1; i < len; i++)
			pf[i] = pf[i - 1] + A[i];

		// storing the prefix array to hashmap.
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(0, -1);// initialize hm with 0 and -1 -> Base case.
		int l = -1; // to store the start index of the final answer.

		for (int i = 0; i < len; i++) {
			if (hm.containsKey(pf[i])) {
				int firstIndex = hm.get(pf[i]);
				int length = i - firstIndex;
				int previousAnswer = answer;
				answer = Math.max(answer, length);
				if (answer > previousAnswer) {
					l = firstIndex + 1;
				}
			} else
				hm.put(pf[i], i);
		}
		// if we got a sub-array sum as 0, build a result array and return it.
		if (answer > 0) {
			// build the result array
			int[] result = new int[answer];
			int i = 0;
			while (i < answer) {
				result[i] = A[l + i];
				i++;
			}
			return result;
		}

		else {
			// create and return an empty array.
			int[] result = {};
			return result;
		}

	}
}
