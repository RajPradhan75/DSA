package datastructures.src.com.interview;

public class MaxSum {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxSum(arr));
    }
    private static int findMaxSum(int[] arr){

        int maxSum = arr[0];
        int curr_sum = maxSum;
        for(int i = 1; i< arr.length; i++){
            curr_sum = Math.max(curr_sum + arr[i], arr[i]);
            maxSum = Math.max(curr_sum, maxSum);
        }

        return maxSum;
    }
}
