package datastructures.src.com.scaler.array.subarray;

import java.util.HashSet;
import java.util.Set;

public class BitWiseORsubArrays {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2 }; // o/p: 3

//		Explanation: The possible subarrays are [1], [1], [2], [1, 1], [1, 2], [1, 1, 2].
//		These yield the results 1, 1, 2, 1, 3, 3.
//		There are 3 unique values, so the answer is 3.

		System.out.println(solve(arr));

	}

	static int solve(int[] arr) {

		Set<Integer> res = new HashSet<>(), cur = new HashSet<>(), cur2;
		for (Integer i : arr) {
			cur2 = new HashSet<>();
			cur2.add(i);
			for (Integer j : cur)
				cur2.add(i | j);
			res.addAll(cur = cur2);
		}
		return res.size();

	}

}
