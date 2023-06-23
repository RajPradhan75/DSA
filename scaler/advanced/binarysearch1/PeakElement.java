package datastructures.src.com.scaler.advanced.binarysearch1;

public class PeakElement {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 1 };

		System.out.println(findPeakElement(A));
	}

	public static int findPeakElement(int[] nums) {
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] > nums[mid + 1]) {
				// We are in a decreasing part of the array, so the peak is on the left
				right = mid;
			} else {
				// We are in a increasing part of the array, so the peak is on the right
				left = mid + 1;
			}
		}

		// At the end of the loop, 'left' will be pointing to the peak element
		return nums[left];
	}


}
