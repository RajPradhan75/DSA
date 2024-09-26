package datastructures.src.com.scaler.advanced.heaps;

import java.util.*;

public class TopKFrequentElements {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		System.out.println(Arrays.toString(topKFrequent(nums, k)));
	}

	public static int[] topKFrequent(int[] nums, int k) {

		HashMap<Integer, Integer> freqMap = new HashMap<>();

		for (int num : nums) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}

		PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> {
			int freqComp = b.getValue() - a.getValue();
			if (freqComp != 0) {
				return freqComp;
			} else {
				return a.getKey() - b.getKey();
			}
		});

/*		PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a,b)->{
			int freqComp =  Integer.compare(b.getValue(),a.getValue());
			if(freqComp !=0)
				return freqComp;
			else
				return Integer.compare(a.getValue(), b.getValue());
		});*/

		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
			maxHeap.offer(entry);
		}

		int[] result = new int[k];
		int i = 0;
		while (i < k)
			result[i++] = Objects.requireNonNull(maxHeap.poll()).getKey();

		return result;
	}
}
