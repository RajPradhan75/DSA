package datastructures.src.com.interview;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        String s = "loveleetcode";

        System.out.println(findFirstRepeatingChar(s));
    }

    private static int findFirstRepeatingChar(String s) {

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}
