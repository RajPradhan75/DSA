package datastructures.src.com.scaler.advanced.twopointers;

import java.util.Arrays;

public class SortColors {

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		solve(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void solve(int[] nums) {

		int low = 0;
		int high = nums.length - 1;
		int mid = 0;
		int temp = 0;

		while (mid <= high) {
			switch (nums[mid]) {
			case 0: {
				temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
				break;
			}
			}
		}

	}

}
