package datastructures.src.com.interview.string;

import java.util.ArrayList;
import java.util.List;

public class AlmostEquivalentString {

    public static void main(String[] args) {
        String[] s = {"aabaab", "aaaaabb"};
        String[] t = {"bbabbc", "abb"};

        List<String> result = areAlmostEquivalent(s, t);
        System.out.println(result);
    }

    private static List<String> areAlmostEquivalent(String[] s, String[] t) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < s.length; i++) {
            if (isAlmostEquivalent(s[i], t[i])) {
                result.add("YES");
            } else {
                result.add("NO");
            }
        }
        return result;
    }

    private static boolean isAlmostEquivalent(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] sCount = new int[26];
        int[] tCount = new int[26];

        for (char c : s.toCharArray()) {
            sCount[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            tCount[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (Math.abs(sCount[i] - tCount[i]) > 3) {
                return false;
            }
        }
        return true;
    }
}
