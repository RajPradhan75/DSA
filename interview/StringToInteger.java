package datastructures.src.com.interview;

public class StringToInteger {

    public static void main(String[] args) {
        String str = "12345";
        int result = convertToInt(str);
        System.out.println("Converted integer: " + result);
    }

    public static int convertToInt(String str) {

        int result = 0;
        int sign = 1;
        int i = 0;


        if (str.charAt(0) == '-') {
            sign = -1;
            i = 1;
        }

        while (i < str.length()) {
            char c = str.charAt(i);
            int digit = c - '0';

            if (digit < 0 || digit > 9) {
                throw new NumberFormatException("Invalid Input: " + str);
            }

            result = result * 10 + digit;

            i++;

        }

        return sign * result;
    }


}
