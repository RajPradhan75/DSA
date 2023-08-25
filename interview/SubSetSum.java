package datastructures.src.com.interview;

import java.util.ArrayList;
import java.util.List;

public class SubSetSum {

    public static List<List<Integer>> findSubsetsWithSum(int[] nums, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, targetSum, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, int startIndex, int targetSum, List<Integer> current, List<List<Integer>> result) {
        if (targetSum == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = startIndex; i < nums.length; i++) {
            if (nums[i] <= targetSum) {
                current.add(nums[i]);
                backtrack(nums, i + 1, targetSum - nums[i], current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 4, 8, 3};
        int targetSum = 7;

        List<List<Integer>> subsets = findSubsetsWithSum(nums, targetSum);

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}


