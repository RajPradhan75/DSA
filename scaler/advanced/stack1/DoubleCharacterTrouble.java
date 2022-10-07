package datastructures.src.com.scaler.advanced.stack1;

public class DoubleCharacterTrouble {

	public static void main(String[] args) {
		String A = "abccbc";
		System.out.println(solve(A));
	}

	private static String solve(String A) {

		StringBuilder sb = new StringBuilder();
		for (char c : A.toCharArray()) {
			int size = sb.length();
			if (size > 0 && sb.charAt(size - 1) == c) {
				sb.deleteCharAt(size - 1);
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
