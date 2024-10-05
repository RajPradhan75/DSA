package datastructures.src.com.neetcode.arraysandhashing;

public class PermutationInString {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.printf(String.valueOf(checkPermutation(s1,s2)));
    }

    private static boolean checkPermutation(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }


        // Sliding window starts: now compare arrays over s2
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            // If s1Count matches s2Count in the current window, return true
            if (matches(s1Count, s2Count)) {
                return true;
            }

            // Slide the window to the right:
            // Add the next character from s2 to the window
            s2Count[s2.charAt(i + s1.length()) - 'a']++;
            // Remove the character that is no longer in the window
            s2Count[s2.charAt(i) - 'a']--;
        }

        return matches(s1Count, s2Count);

    }

    private static boolean matches(int[] s1Count, int[] s2Count) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != s2Count[i]) {
                return false;
            }
        }
        return true;
    }
}
