package datastructures.src.com.scaler.advanced.greedyalgorithm;

import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class MaximumJobCount {

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 5, 7, 1);
		List<Integer> B = Arrays.asList(7, 8, 8, 8);
		System.out.println(solve(A, B));
	}

	public static void heapify(List<Integer> a, List<Integer> b, int pi, int endIndex) {
		int index = pi;
		int mi = index;
		// Compare current index with parent index
		while (mi <= endIndex) {
			int lIndex = index + 1;
			int rIndex = index + 2;
			if (lIndex > endIndex)
				break;
			if (b.get(lIndex) > b.get(mi)) {
				mi = lIndex;
			}
			if (rIndex <= endIndex && b.get(rIndex) > b.get(mi)) {
				mi = rIndex;
			}
			if (mi == index) {
				break;
			}
			Collections.swap(b, index, mi);
			Collections.swap(a, index, mi);
			index = mi;
		}
	}

	public static void heapSort(List<Integer> a, List<Integer> b) {
		// We have to swap currentIndex with lastIndex and do heapify process
		int n = a.size();
		int endIndex = n - 1;
		for (int i = 0; i < n; ++i) {
			Collections.swap(a, 0, endIndex);
			Collections.swap(b, 0, endIndex);
			endIndex--;
			heapify(a, b, 0, endIndex);
		}
	}

	public static int maxReward(List<Integer> a, List<Integer> b) {
		// We can use heap sort and sort both the arrays
		// First Converting array to maxHeap
		int maxJobs = 1;
		int n = b.size();
		int pi = (n - 2) / 2;
		for (int i = pi; i >= 0; --i) {
			heapify(a, b, i, n - 1);
		}
		heapSort(a, b);
		// Now both of the arrays are sorted based on endTime
		int end = b.get(0);
		for (int i = 1; i < n; ++i) {
			if (end <= a.get(i)) {
				end = b.get(i);
				maxJobs++;
			}
		}
		return maxJobs;

	}

	public static int solve(List<Integer> a, List<Integer> b) {
		return maxReward(a, b);
	}

}
