package datastructures.src.com.scaler.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class IsDictionary {

	public static void main(String[] args) {
		ArrayList<String> A = new ArrayList<String>();
		A.add("hello");
		A.add("scaler");
		A.add("interviewbit");

		String B = "adhbcfegskjlponmirqtxwuvzy";

		System.out.println(solve(A, B));
	}

	public static int solve(ArrayList<String> A, String B) {
		int m = A.size();

		int n = B.length();
		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			hm.put(B.charAt(i), i);
		}

		for (int i = 1; i < m; i++) {
			if (!compareAndValidateOrder(hm, A.get(i - 1), A.get(i))) {
				return 0;
			}
		}

		return 1;
	}

	public static boolean compareAndValidateOrder(HashMap<Character, Integer> hm, String a, String b) {
		int minLen = Math.min(a.length(), b.length());

		for (int i = 0; i < minLen; i++) {
			if (!(a.charAt(i) == b.charAt(i))) {
		
				return hm.get(a.charAt(i)) <= hm.get(b.charAt(i));
			}
		}

		return a.length() <= b.length();

	}

}
