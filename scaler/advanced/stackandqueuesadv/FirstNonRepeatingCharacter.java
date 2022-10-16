package datastructures.src.com.scaler.advanced.stackandqueuesadv;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String A = "abadbc";
		System.out.println(solve(A));
	}

	private static String solve(String A) {
		// initialize HashMap
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		// initialize simple Queue
		Queue<Character> queue = new LinkedList<Character>();
		// initialize output string
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < A.length(); i++) {

			char currentChar = A.charAt(i);

			// step 1 : insert new character into HashMap and update frequency
			map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

			// step 2: update queue - add current character only when it's frequency is == 1
			if (map.get(currentChar) == 1) {
				queue.add(currentChar);
			}

			// step 3: remove all elements from front whose frequency in map > 1 as these
			// can not be possible answers
			while (!queue.isEmpty() && map.get(queue.peek()) > 1) {
				queue.remove();
			}
			// step 4: update answer
			if (queue.isEmpty()) {
				sb.append("#");
			} else {
				sb.append(queue.peek());
			}

		}
		return sb.toString();
	}

}
