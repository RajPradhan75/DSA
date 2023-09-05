package datastructures.src.com.interview.string;

public class BreakAPalindrome {

    public static void main(String[] args) {
        String palindrome = "abccba";
        System.out.println(breakPalindrome(palindrome));
    }

    private static String breakPalindrome(String palindrome) {
        if (palindrome == null || palindrome.length() <= 1)
            return "IMPOSSIBLE";

        char[] chars = palindrome.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != 'a') {
                chars[i] = 'a';
                return new String(chars);
            }
        }


        chars[chars.length - 1] = 'b';
        return new String(chars);

    }
}
