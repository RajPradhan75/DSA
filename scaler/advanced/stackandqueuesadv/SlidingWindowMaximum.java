package datastructures.src.com.scaler.advanced.stackandqueuesadv;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int[] A = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int B = 3;
		System.out.println(Arrays.toString(slidingMaximum(A, B)));
	}

	private static int[] slidingMaximum(final int[] A, int B) {

		if (A == null || B <= 0)
			return new int[0];

		int n = A.length;
		int[] r = new int[n - B + 1];
		int ri = 0;

		// store index
		Deque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			// remove numbers out of range k
			while (!q.isEmpty() && q.peek() < i - B + 1) {
				q.poll();
			}
			// remove smaller numbers in k range as they are useless
			while (!q.isEmpty() && A[q.peekLast()] < A[i]) {
				q.pollLast();
			}
			// q contains index...r contains content
			q.offer(i);
			if (i >= B - 1)
				r[ri++] = A[q.peek()];
		}
		return r;
	}

}
