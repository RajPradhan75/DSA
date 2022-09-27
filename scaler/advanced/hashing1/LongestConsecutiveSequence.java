package datastructures.src.com.scaler.advanced.hashing1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {

		int[] A = { 100, 4, 200, 1, 3, 2 };
		System.out.println(solve(A));
	}

	private static int solve(int[] A) {

		int n = A.length;

		HashSet<Integer> S = new HashSet<Integer>();
		int ans = 0;

		// Hash all the array elements
		for (int i = 0; i < n; ++i)
			S.add(A[i]);

		// check each possible sequence from the start
		// then update optimal length
		for (int i = 0; i < n; ++i) {
			// if current element is the starting
			// element of a sequence
			if (!S.contains(A[i] - 1)) {
				// Then check for next elements
				// in the sequence
				int j = A[i];
				while (S.contains(j))
					j++;

				// update optimal length if this
				// length is more
				if (ans < j - A[i])
					ans = j - A[i];
			}

		}
		return ans;
	}
}
