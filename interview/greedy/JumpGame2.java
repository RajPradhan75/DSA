package datastructures.src.com.interview.greedy;

public class JumpGame2 {

    public static void main(String[] args) {
        int [] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));

    }

    private static int canJump(int[] nums){
        int n = nums.length;
        int i = 0, maxReachable = 0, lastJumpPos = 0, jumps= 0;

        while(lastJumpPos < n - 1){
            maxReachable = Math.max(maxReachable, i + nums[i]);

            if (i == lastJumpPos){
                lastJumpPos = maxReachable;
                jumps++;
            }
            i++;
        }
        return jumps;
    }
}
