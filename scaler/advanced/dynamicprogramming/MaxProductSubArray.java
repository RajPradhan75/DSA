package datastructures.src.com.scaler.advanced.dynamicprogramming;

public class MaxProductSubArray {
	public static void main(String[] args) {
//		int[] nums = { 2, 3, -2, 4 };
		
		int[] nums = {-3, 0, -5, 0};
//		int[] nums = {4, 2, -5, 1};
	//	We can choose the subarray [4, 2] such that the maximum product is 8.
		System.out.println(solve(nums));
		//Explanation: [2,3] has the largest product 6.
	}

	public static int solve(int[] nums) {
		int prod = 1;
		int result = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			prod = prod * nums[i];
			result = Math.max(prod, result);
			if (prod == 0)
				prod = 1;
		}
		prod = 1;

		for (int i = nums.length - 1; i >= 0; i--) {
			prod = prod * nums[i];
			result = Math.max(prod, result);
			if (prod == 0)
				prod = 1;
		}
		return result;
	}
}
