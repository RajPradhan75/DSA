package datastructures.src.com.interview.greedy;

public class JumpGame {
    public static void main(String[] args) {
        JumpGame solver = new JumpGame();
        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(solver.canJump(nums2)); // prints false
//        System.out.println(solver.canJump(nums1));
    }


    public boolean canJump(int[] nums){
        int maxIndex = nums[0];
        for (int i = 0; i<nums.length; i++){
            if(i > maxIndex){
                return false;
            }

            maxIndex = Math.max(maxIndex, i + nums[i]);
        }
        return true;
    }

}
