package datastructures.src.com.sdesheet.arrays1;

public class MaximumSubArray {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(solve(nums));
	}

	public static int solve(int[] nums) {

		int maxSum = nums[0];

		int current_sum = maxSum;

		for (int i = 1; i < nums.length; i++) {

			current_sum = Math.max(current_sum + nums[i], nums[i]);

			maxSum = Math.max(current_sum, maxSum);
		}

		return maxSum;

	}

}
