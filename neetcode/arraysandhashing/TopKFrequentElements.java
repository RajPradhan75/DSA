package datastructures.src.com.neetcode.arraysandhashing;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }




  /*  public class BruteForceTopKFrequent {

        // Function to count the frequency of an element in the array
        private static int countFrequency(int[] nums, int element) {
            int count = 0;
            for (int num : nums) {
                if (num == element) {
                    count++;
                }
            }
            return count;
        }

        public static int[] topKFrequent(int[] nums, int k) {
            int[] result = new int[k];
            boolean[] visited = new boolean[nums.length]; // To mark elements that have already been picked

            for (int i = 0; i < k; i++) {
                int maxCount = 0;
                int maxElement = nums[0];

                // Find the element with the maximum frequency that hasn't been picked yet
                for (int j = 0; j < nums.length; j++) {
                    if (!visited[j]) {
                        int frequency = countFrequency(nums, nums[j]);
                        if (frequency > maxCount) {
                            maxCount = frequency;
                            maxElement = nums[j];
                        }
                    }
                }

                // Add the found element to the result and mark all instances of it as visited
                result[i] = maxElement;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == maxElement) {
                        visited[j] = true;
                    }
                }
            }

            return result;
        }

        public static void main(String[] args) {
            int[] nums = {1, 1, 1, 2, 2, 3};
            int k = 2;
            int[] result = topKFrequent(nums, k);
            System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
        }
    }

*/



    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num: nums){
            freqMap.put(num,freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a,b)->{
            int freqComp = Integer.compare(b.getValue(), a.getValue());
            if (freqComp != 0)
                return freqComp;
            else
                return Integer.compare(a.getValue(),b.getValue());
        });

        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet())
            maxHeap.offer(entry);

        int [] result = new int[k];
        int i = 0;

        while (i < k){
            result[i++] = maxHeap.poll().getKey();
        }

        return result;
    }



}
