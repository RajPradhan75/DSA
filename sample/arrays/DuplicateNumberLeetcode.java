package datastructures.src.com.sample.arrays;

public class DuplicateNumberLeetcode {

	public static void main(String[] args) {
		int nums[] = { 4, 3, 1, 2, 1, 3, 5 };
		int duplicateNum = findDuplicateNumber(nums);
		System.out.println(duplicateNum);
	}

	static int findDuplicateNumber(int nums[]) {
		int slow = 0, fast = 0;

		do {

			slow = nums[slow];
			fast = nums[nums[fast]];

		} while (slow != fast);

		int slow2 = 0;
		do {
			slow = nums[slow];
			slow2 = nums[slow2];
		} while (slow != slow2);

		return slow;
	}

}
