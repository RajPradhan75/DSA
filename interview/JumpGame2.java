package datastructures.src.com.interview;

public class JumpGame2 {

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(minJump(nums));
    }

    private static int minJump(int[] nums){

        int n = nums.length;

        int maxReachable = 0, jumps = 0, lastReachedPos = 0, i = 0;

        while (i < n - 1){

            maxReachable = Math.max(maxReachable, i + nums[i]);

            if(i == lastReachedPos){
                lastReachedPos = maxReachable;
                jumps++;
            }
            i++;
        }

        return jumps;
    }
}
