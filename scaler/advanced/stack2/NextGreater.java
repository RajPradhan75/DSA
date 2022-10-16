package datastructures.src.com.scaler.advanced.stack2;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		int[] A = { 4, 5, 2, 10 };
		System.out.println(Arrays.toString(solve(A)));

	}

	private static int[] solve(int[] A) {
		int[] ans = new int[A.length];
		Stack<Integer> stack = new Stack<>();

		for (int i = A.length - 1; i >= 0; i--) {

			while (!stack.empty() && stack.peek() <= A[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				ans[i] = -1;
			} else {
				ans[i] = stack.peek();
			}
			stack.push(A[i]);
		}
		return ans;
	}

}
