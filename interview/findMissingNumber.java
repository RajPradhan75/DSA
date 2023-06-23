package datastructures.src.com.interview;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int N = arr.length;
        System.out.println(getMissingNo(arr, N));
    }

    public static int getMissingNo(int[] arr, int n) {
            int xor = 0;

            for(int i = 1; i<=n+1;i++){
                xor ^= i;
            }

            for(int num : arr){
                xor ^= num;
            }

            return xor;
    }
}
