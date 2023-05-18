package datastructures.src.com.scaler.advanced.arrays3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
//        int [] nums = {1,2,3,1};
        int[] nums = {1, 0, 1, 1};
//        int [] nums = {1,2,3,1,2,3};
        int k = 1;
        System.out.println(findDuplicate(nums, k));
    }

    public static boolean findDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int a = -1;
        int b = -1;
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                a = hm.get(nums[i]);
                b = i;
                if (Math.abs(a - b) <= k) {
                    return true;
                }
            }
            hm.put(nums[i], i);
        }


        return false;
    }
}
