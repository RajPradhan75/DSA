package datastructures.src.com.scaler.advanced.hashing1;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SortArrayInOrder {

	public static void main(String[] args) {

		int[] A = { 2,3,1,3,2,4,6,7,9,2,19};
		int[] B = {2,1,4,3,9,6 };
		System.out.println(Arrays.toString(solve(A, B)));
	}

	private static int[] solve(int[] A, int[] B) {

		int lenA = A.length, lenB = B.length;
		Map<Integer, Integer> freq = new TreeMap<>();
		int[] sortedA = new int[lenA];

		// 1. add freq to map

		for (int i = 0; i < lenA; i++)
			freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
		

		/*
		 * 2. iterated array B and look for elem present in B n add them accordingly
		 * 
		 * to sorted_A as per elem freq in A
		 */

		int j = 0;
		for (int i = 0; i < lenB && j < lenA; i++) {
			if (freq.containsKey(B[i])) {
				int noOfElem = freq.get(B[i]);
				while (noOfElem > 0) {
					sortedA[j] = B[i];
					j++;
					noOfElem--;
				}
				freq.remove(B[i]);
			}
		}

		/* 3. add remaining elem in A at the end for sorted elem as is */

		for (Integer key : freq.keySet()) {
			if (freq.containsKey(key) && j < lenA) {
				int noOfElem = freq.get(key);
				while (noOfElem > 0) {
					sortedA[j] = key;
					j++;
					noOfElem--;
				}
			}
		}
		return sortedA;
	}
	
	//n * log n
}
