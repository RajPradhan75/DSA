package datastructures.src.com.sample.arrays;

public class FirstUniqueChar {
	public static void main(String[] args) {
		String s = "loveleetcode";
		int result = findFirstNonUnique(s);
		System.out.println(result);
	}

	static int findFirstNonUnique(String s) {

		int freq[] = new int[26];
		for (int i = 0; i < s.length(); i++)
			freq[s.charAt(i) - 'a']++;
		for (int i = 0; i < s.length(); i++)
			if (freq[s.charAt(i) - 'a'] == 1)
				return i;
		return -1;

	}
}
