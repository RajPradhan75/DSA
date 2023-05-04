package datastructures.src.com.scaler.advanced.heaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		System.out.println(Arrays.toString(topKFrequent(nums, k)));
	}

	public static int[] topKFrequent(int[] nums, int k) {

		HashMap<Integer, Integer> freqMap = new HashMap<>();

		for (int num : nums) {
			freqMap.put(num, freqMap.getOrDefault(freqMap, 0) + 1);
		}

		PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> {
			int freqComp = b.getValue() - a.getValue();
			if (freqComp != 0) {
				return freqComp;
			} else {
				return a.getKey() - b.getKey();
			}
		});

		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
			maxHeap.offer(entry);
		}

		int[] result = new int[k];
		int i = 0;
		while (i < k)
			result[i++] = maxHeap.poll().getKey();

		return result;
	}
}
