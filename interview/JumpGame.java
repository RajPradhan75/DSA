package datastructures.src.com.interview;

public class JumpGame {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));
    }


    private static boolean canJump(int[] nums) {

        int maxIndex = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (i > maxIndex) return false;

            maxIndex = Math.max(maxIndex, i + maxIndex);
        }
        return true;
    }
}
