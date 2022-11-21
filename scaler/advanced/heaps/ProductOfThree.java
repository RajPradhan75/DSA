package datastructures.src.com.scaler.advanced.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ProductOfThree {

	public static void main(String[] args) {

//		List<Integer> A = Arrays.asList(10, 2, 13, 4);
//		List<Integer> A = Arrays.asList(1, 2, 3, 4, 5);
		
		int[] nums = {10, 2, 13, 4};
	

		System.out.println(solve(nums));
	}

	private static ArrayList<Integer> solve(List<Integer> A) {

		ArrayList<Integer> ans = new ArrayList<Integer>();

		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i = 0; i < A.size(); i++) {
			maxHeap.add(A.get(i));

			if (i < 2) {
				ans.add(-1);
			} else {
				int max1 = maxHeap.poll();
				int max2 = maxHeap.poll();
				int max3 = maxHeap.poll();
				ans.add(max1 * max2 * max3);
				maxHeap.add(max1);
				maxHeap.add(max2);
				maxHeap.add(max3);
			}
		}
		
		return ans;
	}
	
	private static int solve(int[] nums) {
		
		   PriorityQueue<Integer> poheap = new PriorityQueue<>();
	        PriorityQueue<Integer> neheap = new PriorityQueue<>(Collections.reverseOrder());
	        for (int num : nums) {
	            poheap.offer(num);
	            neheap.offer(num);
	            if (poheap.size() > 3) {
	                poheap.poll();
	            }
	            if (neheap.size() > 2) {
	                neheap.poll();
	            }
	        }
	        int c1 = 1;
	        int max = 0;
	        while (!poheap.isEmpty()) {
	            max = poheap.poll();
	            c1 *= max;
	        }
	        while (!neheap.isEmpty()) {
	            max *= neheap.poll();
	        }
	        return Math.max(c1, max);
	}

}
