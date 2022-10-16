package datastructures.src.com.scaler.advanced.stack2;

import java.util.Arrays;
import java.util.Stack;

public class MaxAreaInHistogram {

	public static void main(String[] args) {
		int[] A = { 2, 1, 5, 6, 2 };
//		int[] A = { 1 };
		System.out.println(solve(A));

	}

	private static int solve(int[] A) {

		int maxAns = Integer.MIN_VALUE;
		int ps[] = leftMin(A);
		int ns[] = rightMin(A);

		for (int i = 0; i < A.length; i++) {
			int curr = (ns[i] - ps[i] - 1) * A[i];
			maxAns = Math.max(curr, maxAns);
		}
		return maxAns;
	}

	static int[] leftMin(int[] A) {

		int n = A.length;
		int[] leftMin = new int[n];
		Stack<Integer> left = new Stack<>();
		Arrays.fill(leftMin, -1);
		for (int i = A.length - 1; i >= 0; i--) {
			if (left.isEmpty() || A[i] >= A[left.peek()]) {
				left.add(i);
			} else {
				while (!left.isEmpty() && A[left.peek()] > A[i]) {
					leftMin[left.peek()] = i;
					left.pop();
				}
				left.add(i);
			}
		}
		return leftMin;
	}

	static int[] rightMin(int[] A) {

		int n = A.length;
		int[] rightMin = new int[n];
		Stack<Integer> right = new Stack<>();
		Arrays.fill(rightMin, n);
		for (int i = 0; i < A.length; i++) {
			if (right.isEmpty() || A[i] >= A[right.peek()]) {
				right.add(i);
			} else {
				while (!right.isEmpty() && A[right.peek()] > A[i]) {
					rightMin[right.peek()] = i;
					right.pop();
				}
				right.add(i);
			}
		}
		return rightMin;
	}
}
