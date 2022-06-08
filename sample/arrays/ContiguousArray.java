package datastructures.src.com.sample.arrays;

import java.util.HashMap;

public class ContiguousArray {

	public static void main(String[] args) {
		int nums[] = { 0, 1, 0, 1, 0, 1 };
		int res = findContiguousArray(nums);
		System.out.println("occurence:");
		System.out.println(res);

	}

	static int findContiguousArray(int[] nums) {

		// BruteForce ---> O(n^2)
//		int maxlen = 0;
//
//		for (int i = 0; i < nums.length; i++) {
//			  int zeroes = 0, ones = 0;
//			for (int j = i; j < nums.length; j++) {
//				if (nums[j] == 0) {
//					zeroes++;
//				} else {
//					ones++;
//				}
//
//				if (zeroes == ones) {
//					maxlen = Math.max(maxlen, j - i + 1);
//				}
//
//			}
//		}
//
//		return maxlen;

		// T.C ---> O(n) , S.C ----> O(1)

		HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();

		counts.put(0, -1);

		int max_length = 0;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count += -1;
			} else {
				count += 1;
			}

			if (counts.containsKey(count)) {
				max_length = Math.max(max_length, i - counts.get(count));
			} else {
				counts.put(count, i);
			}

		}
		return max_length;

	}

}
