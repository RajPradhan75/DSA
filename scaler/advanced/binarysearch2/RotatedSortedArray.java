package datastructures.src.com.scaler.advanced.binarysearch2;

public class RotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 6;
		System.out.println(solve(nums, target));
	}

	private static int solve(int[] nums, int target) {

		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (target == nums[mid])
				return mid;

			if (nums[low] <= nums[mid]) { // left sorted part
				if (target >= nums[low] && target < nums[mid]) { // check if target is in left range
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (target > nums[mid] && target <= high) { // check if target is in right part range
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}
}
