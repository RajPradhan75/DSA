package datastructures.src.com.interview;

public class MissingNo2 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 3};
        System.out.println(findMissingNum(arr));
    }

    private static int findMissingNum(int[] arr) {

        int xor = 0, i = 0;

        for (i = 0; i < arr.length; i++) {
            xor ^= arr[i] ^ i;
        }
        return xor ^ i;
    }
}
