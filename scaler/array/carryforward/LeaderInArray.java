package datastructures.src.com.scaler.array.carryforward;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LeaderInArray {

	public static void main(String[] args) {
		int[] A = { 16, 17, 4, 3, 5, 2 };
		System.out.println(Arrays.toString(solve(A)));

	}

	public static int[] solve(int[] A) {

		// O(N^2) Approach

		/*
		 * int result[] = null;
		 * 
		 * int itr = 0;
		 * 
		 * for (int i = 0; i < A.length; i++) { int j; for (j = i + 1; j < A.length;
		 * j++) { if (A[i] <= A[j]) break; } if (j == A.length) // loop didn't break
		 * System.out.print(A[i] + " ");
		 * 
		 * }
		 */

		// O(N)
		int max = A[A.length - 1];

		Set<Integer> set = new HashSet<>();
		set.add(A[A.length - 1]);

		for (int i = A.length - 2; i >= 0; i--) {

			if (max < A[i]) {
				max = A[i];
				set.add(max);
			}

		}

		int arr[] = new int[set.size()];
		int count = 0;
		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			arr[count] = (int) i.next();
			count++;
		}
		return arr;

	}

}
