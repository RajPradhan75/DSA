package datastructures.src.com.scaler.advanced.stack1;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	
	public static void main(String[] args) {
		String [] tokens = {"2","1","+","3","*"}; 
		System.out.println(solve(tokens));
	}
	
	private static int solve(String [] tokens) {
		
		Stack<Integer> stack = new Stack<>();
		
		for(String token : tokens) {
			if(token.equals("+")) {
				stack.add(stack.pop() + stack.pop());
			}else if (token.equals("-")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.add(b - a);
			}else if (token.equals("*")) {
				stack.add(stack.pop()*stack.pop());
			}else if(token.equals("/")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.add(b/a);
			}else {
				stack.add(Integer.parseInt(token));
			}
		}
		return stack.pop();
	}
}
