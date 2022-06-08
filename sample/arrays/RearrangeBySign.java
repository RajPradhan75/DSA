package datastructures.src.com.sample.arrays;

import java.util.Arrays;

public class RearrangeBySign {

	public static void main(String[] args) {
		int[] arr = { 3, 1, -2, -5, 2, -4 };
		int n = arr.length;
		int[] res = rearrangeBySign(arr, n);
		System.out.println(Arrays.toString(res));
	}

	static int[] rearrangeBySign(int[] nums, int n) {
		// TODO Auto-generated method stub
        int[] ans = new int[nums.length];
        int pos_index = 0, neg_index = 1;
        
        for (int i=0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pos_index] = nums[i];
                pos_index += 2;
            }
            if (nums[i] < 0) {
                ans[neg_index] = nums[i];
                neg_index += 2;
            }
        }
        
        return ans;

	}

}
