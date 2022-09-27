package datastructures.src.com.scaler.advanced.stringswithhashmap;

import java.util.HashSet;

public class LongestSubstringWithoutRepeat {

	public static void main(String[] args) {
		String A = "abcabcbb";
		System.out.println(solve(A));
	}

	private static int solve(String A) {
		HashSet<Character> set = new HashSet<>();
		int left = 0;
		int ans = 0;
		for (int right = 0; right < A.length(); right++) {
			while (set.contains(A.charAt(right))) {
				set.remove(A.charAt(left));
				left++;
			}
			set.add(A.charAt(right));
			ans = Math.max(ans, right - left + 1);
		}
		return ans;
	}

}
