package datastructures.src.com.scaler.recursion;

public class ReverseString {

	public static void main(String[] args) {
		String s = "scaleracademy";

		System.out.println(solve(s));
	}

	public static String solve(String s) {

		int n = s.length();

		String ans = reverse(s, 0, n - 1);

		return ans;
	}

	public static String reverse(String s, int start, int end) {

		char[] str = s.toCharArray();

		char temp;

		if (start > end)
			return s;

		temp = str[start];
		str[start] = str[end];
		str[end] = temp;
		start++;
		end--;
		
		String reversedString = String.valueOf(str);

		return reverse(reversedString, start, end);

	}

}
