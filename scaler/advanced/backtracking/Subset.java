package datastructures.src.com.scaler.advanced.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<>();
		helper(ans, 0, nums, list);
		return ans;
	}

	public static void helper(List<List<Integer>> ans, int start, int[] nums, List<Integer> list) {

		if (start >= nums.length) {
			ans.add(new ArrayList<>(list));
		} else {
			// add the element and start the recursive call
			list.add(nums[start]);
			helper(ans, start + 1, nums, list);
			
			//remove the element and do the backtracking call
			list.remove(list.size() - 1);
			helper(ans, start + 1, nums, list);
		}

	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));
	}
	
	//------------------------------Scaler-------------------------------------//
//    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//		ArrayList<Integer> list = new ArrayList<>();
//        Collections.sort(A);
//		helper(ans, 0, A, list);
//		return ans;
//    }
//
//    	public static void helper(ArrayList<ArrayList<Integer>> ans, int start, ArrayList<Integer> nums, ArrayList<Integer> list) {
//
//		if (start >= nums.size()) {
//			ans.add(new ArrayList<>(list));
//		} else {
//			// add the element and start the recursive call
//			list.add(nums.get(start));
//			helper(ans, start + 1, nums, list);
//			
//			//remove the element and do the backtracking call
//			list.remove(list.size() - 1);
//			helper(ans, start + 1, nums, list);
//		}
//
//	}
	
	

}
