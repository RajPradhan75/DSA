package datastructures.src.com.scaler.advanced.stackandqueuesadv;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		Stack<Integer> input = new Stack<Integer>();
		input.add(34);
		input.add(3);
		input.add(31);
		input.add(98);
		input.add(92);
		input.add(23);

		System.out.println(solve(input));
	}

	private static Stack<Integer> solve(Stack<Integer> input) {

		Stack<Integer> tmpstack = new Stack<Integer>();

		while (!input.isEmpty()) {

			int tmp = input.pop();

			while (!tmpstack.isEmpty() && tmpstack.peek() > tmp) {
				input.push(tmpstack.pop());
			}

			tmpstack.push(tmp);
		}
		return tmpstack;
	}

}
