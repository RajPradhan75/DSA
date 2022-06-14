package datastructures.src.com.scaler.array.bitmanipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {
		int[] A = { 1, 2, 2, 3, 1 };
		System.out.println(solve(A));
//		solve(A);

	}

	public static int solve(int[] A) {

//1, 2, 2, 3, 1 
//		Map<Integer, Integer> map = new HashMap<>();
//
//		for (int i = 0; i < A.length; i++) {
//			if (map.containsKey(A[i])) {
//				map.put(A[i], map.get(A[i]) + 1);
//			} else {
//				map.put(A[i], 1);
//			}
//		}
//
//		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			if (entry.getValue() == 1)
//				return entry.getKey();
//		}
//		return -1;

//	Optimised XOR approach

		int result = 0;
		for (int i = 0; i < A.length; i++) {
			result ^= A[i];
		}
		return result;
	}
}
