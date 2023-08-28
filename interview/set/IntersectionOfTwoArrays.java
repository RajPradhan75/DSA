package datastructures.src.com.interview.set;

import java.util.*;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        //output: 2

        System.out.println(Arrays.toString(findIntersection(nums1, nums2)));
    }

    private static int[] findIntersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        List<Integer> intersection = new ArrayList<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int res : nums2) {
            if (set.remove(res))
                intersection.add(res);
        }

        int[] result = intersection.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }
}
