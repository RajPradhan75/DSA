package datastructures.src.com.scaler.hashing;

import java.util.HashMap;
import java.util.Map;

public class DiffII {

	public static void main(String[] args) {

//		int[] A = { 11, 85, 100, 44, 3, 32, 96, 72, 93, 76, 67, 93, 63, 5, 10, 45, 99, 35, 13 };
		int[] A = { 3, 1, 4, 1, 5 };
		// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 , 10, 11, 13, 14,15, 16, 17, 18, 20
//		int k = 60;
		int k = 2;
		System.out.println(solve(A, k));
	}

//	public static int solve(final int[] A, int B) {
//		HashSet<Integer> hs = new HashSet<>();
//		for (int i = 0; i < A.length; i++) {
//			if (hs.contains(B + A[i]) || hs.contains(A[i] - B)) {
//				return 1;
//			} else {
//				hs.add(A[i]);
//			}
//		}
//		return 0;
//	}

	public static int solve(int[] A, int B) {
		if (A == null || A.length == 0 || B < 0)
			return 0;

		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i : A) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (B == 0) {
				// count how many elements in the array that appear more than twice.
				if (entry.getValue() >= 2) {
					count++;
				}
			} else {
				if (map.containsKey(entry.getKey() + B)) {
					count++;
				}
			}
		}

		return count;
	}

//	public static int diff(int[] A, int B) {
//
//		
//		Map<Integer, Integer> map = new HashMap<>();
//		
//		for(int i = 0; i<A.length ; i++) {
//			if(map.containsKey(B + A[i])  || map.containsKey(A[i] - B)) 
//				return 1;
//			else
//				map.put(A[i], 1);
//		}
//
//		return 0;
//	}
}
