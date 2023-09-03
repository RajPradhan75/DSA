package datastructures.src.com.interview.strings;

public class AddTwoNumString {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println(addStrings(num1, num2));
    }

    private static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int x = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int y = (j >= 0) ? num2.charAt(i) - '0' : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            result.append(sum % 10);
            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
