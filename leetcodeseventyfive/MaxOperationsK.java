package datastructures.src.com.leetcodeseventyfive;

import java.util.Arrays;

public class MaxOperationsK {

    // bruteforce

   /* public static int maxOperations(int[] nums, int k) {
        int count = 0;
        boolean[] used = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            for (int j = i + 1; j < nums.length; j++) {
                if (!used[j] && nums[i] + nums[j] == k) {
                    count++;
                    used[i] = true;
                    used[j] = true;
                    break;
                }
            }
        }

        return count;
    }*/




    public static int maxOperations(int[] nums, int k){
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        int j = nums.length - 1;

        while(i < j){
            int sum = nums[i] + nums [j];

            if(sum == k){
                count++;
                i++;
                j--;
            } else if (sum > k) {
                j--;
            }else {
                i++;
            }
        }
        return count;
    }




    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 3};
        int k = 6;

        int result = maxOperations(nums, k);
        System.out.println("Maximum Operations: " + result);
    }
}
