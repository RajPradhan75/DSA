package datastructures.src.com.sample.arrays;

public class MaximumSubarray {

	public static void main(String[] args) {
		int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int n = nums.length;
		System.out.println(maxSubSumArrayKadane(nums));
	}

	// bruteforce O(n^2)
	static int findMaxSubArray(int[] nums, int n) {

		int best_sum = -Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {

			int sum = nums[i];
			best_sum = Math.max(sum, best_sum);

			for (int j = i + 1; j < n; j++) {
				sum += nums[j];
				best_sum = Math.max(sum, best_sum);
			}
		}

		return best_sum;

	}

	static int maxSubSumArrayKadane(int nums[]) {

		int max_sum = nums[0];
		int current_sum = max_sum;

		for (int i = 1; i < nums.length; i++) {

			current_sum = Math.max(nums[i] + current_sum, nums[i]);
			max_sum = Math.max(current_sum, max_sum);

		}

		return max_sum;

	}

}
