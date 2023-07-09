package datastructures.src.com.interview;

import java.util.HashSet;

public class LongestSubstringWithoutRepeat {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(findLongestSubString(s));
    }

    private static int findLongestSubString(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            count = Math.max(count, right - left + 1);
        }
        return count;
    }


}
