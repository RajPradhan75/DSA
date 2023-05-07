package datastructures.src.com.scaler.advanced.arrays3;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDup(nums));
    }

    public static int removeDup(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1]) count++;
            else
                nums[i-count] = nums[i];
        }
        return n - count;
    }

}
