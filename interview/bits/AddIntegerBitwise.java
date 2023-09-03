package datastructures.src.com.interview.bits;

public class AddIntegerBitwise {

    public static void main(String[] args) {
        int a = 9;
        int b = 11;
//        System.out.println(getSum(a, b));
        System.out.println(iterativeGetSum(a, b));
    }


    private static int iterativeGetSum(int a, int b) {
        while (b != 0) {
            int carry= (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }

    private static int getSum(int a, int b) {
        if (b == 0) return a;
        int carry = (a & b) << 1;
        int sum = a ^ b;
        return getSum(sum, carry);
    }
}
