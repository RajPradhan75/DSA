package datastructures.src.com.interview;

public class CountToMakeSortedArray {

    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 2};
        System.out.println(rotationCount(nums));
    }

    private static int rotationCount(int[] nums) {
        // Bruteforce

        // find minimum element in linear search

/*        int minIdx = 0;
        int minNum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minNum){
                minNum = nums[i];
                minIdx = i;
            }
        }
        return minIdx;*/

        int low = 0, high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:
            if (nums[low] <= nums[high]) {
                if (nums[low] < ans) {
                    index = low;
                    ans = nums[low];
                }
                break;
            }

            // left part is sorted

            if (nums[low] <= nums[mid]) {
                // keep the minimum
                if (nums[low] < ans) {
                    index = low;
                    ans = nums[low];
                }
                //eliminate left half
                low = mid + 1;
            } else { // if right part is sorted

                //keep the minimum
                if (nums[mid] < ans) {
                    index = mid;
                    ans = nums[mid];
                }
                high = mid - 1;
            }
        }
        return index;
    }
}