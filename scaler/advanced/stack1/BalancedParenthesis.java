package datastructures.src.com.scaler.advanced.stack1;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String A = "{([])}";
		System.out.println(solve(A));
	}

	private static int solve(String A) {
		Stack<Character> stack = new Stack<>();

		for (char c : A.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '[')
				stack.push(']');
			else if (c == '{')
				stack.push('}');
			else if (stack.isEmpty() || stack.pop() != c)
				return 0;
		}

		return stack.size() == 0 ? 1 : 0;
	}

}
