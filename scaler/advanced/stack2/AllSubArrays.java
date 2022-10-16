package datastructures.src.com.scaler.advanced.stack2;

import java.util.Stack;

public class AllSubArrays {

	public static void main(String[] args) {
		int[] A = { 2, 3, 1, 4 };
		System.out.println(solve(A));
	}

	private static int solve(int[] A) {

		Stack<Integer> stack = new Stack<>();
		int max = 0;

		for (int i = 0; i < A.length; i++) {
			if (stack.isEmpty()) {
				stack.push(A[0]);
			} else {
				while (!stack.isEmpty() && stack.peek() <= A[i]) {
					max = Math.max(max, stack.peek() ^ A[i]);
					stack.pop();
				}
				if (!stack.isEmpty())
					max = Math.max(max, stack.peek() ^ A[i]);

				stack.push(A[i]);
			}
		}
		return max;
	}

}
