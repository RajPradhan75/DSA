package datastructures.src.com.scaler.stack;

import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {

		MinStack minSt = new MinStack();
		minSt.push(1);
		minSt.push(2);
		minSt.push(-2);
		minSt.getMin();
		minSt.pop();
		minSt.getMin();
		minSt.top();
		

	}

	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();

	public void push(int x) {
		stack.push(x);

		if (minStack.isEmpty())
			minStack.push(x);
		else
			minStack.push(Math.min(x, minStack.peek()));
	}

	public void pop() {

		if (stack.isEmpty()) {
			return;
		} else {
			stack.pop();
			minStack.pop();
		}
	}

	public int top() {
		if (stack.isEmpty())
			return -1;
		else
			return stack.peek();
	}

	public int getMin() {
		if (minStack.isEmpty())
			return -1;
		else
			return minStack.peek();
	}

}
