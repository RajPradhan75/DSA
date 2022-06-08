package datastructures.src.com.neetcode.stack;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		String s = "()[]{}";

		System.out.println(isValid(s));
	}

	static boolean isValid(String s) {
		
		
//	    Stack<Character> stack = new Stack();
//        Map<Character, Character> closeToOpen = new HashMap<>();
//        closeToOpen.put(')','(');
//        closeToOpen.put(']','[');
//        closeToOpen.put('}','{');
//
//        for (char c: s.toCharArray()) {
//            if (closeToOpen.containsKey(c)) {
//                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
//                    stack.pop();
//                }
//                else return false;
//            }
//            else {
//                stack.push(c);
//            }
//        }
//
//        return  stack.isEmpty() ? true : false;
		
		
		

		Stack<Character> stack = new Stack<Character>();

		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '[')
				stack.push(']');
			else if (c == '{')
				stack.push('}');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}

		return stack.isEmpty();

	}

}
