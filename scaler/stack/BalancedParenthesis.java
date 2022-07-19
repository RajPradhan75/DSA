package datastructures.src.com.scaler.stack;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {

		String A = "(()())";

		System.out.println(solve(A));

	}

	public static int solve(String A) {

		Stack<Character> stack = new Stack<>();

		for (char c : A.toCharArray()) {

			if (c == '(')
				stack.push(c);
			else if (!stack.isEmpty() && c == ')' && stack.peek() == '(')
				stack.pop();
			else
				stack.push(c);

		}

		return stack.size() == 0 ? 1 : 0;

	}

}
