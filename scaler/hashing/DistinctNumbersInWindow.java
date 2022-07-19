package datastructures.src.com.scaler.hashing;

public class DistinctNumbersInWindow {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 5, 4, 10 };
		int[] cost = { 40, 30, 20, 10, 40 }; // op: 90
		System.out.println(solve(arr, cost));

	}

	public static int solve(int[] arr, int[] cost) {
		
		int n = arr.length;

		int costThree = Integer.MAX_VALUE;

		// middle element
		for (int j = 0; j < n; j++) {

			int costI = Integer.MAX_VALUE;
			int costK = Integer.MAX_VALUE;

			// left subarray
			for (int i = 0; i < j; i++) {

				if (arr[i] < arr[j])
					costI = Math.min(costI, cost[i]);
			}

			// right subarray
			for (int k = j + 1; k < n; k++) {

				if (arr[k] > arr[j])
					costK = Math.min(costK, cost[k]);
			}

			// if valid triplet found, update min cost so far

			if (costI != Integer.MAX_VALUE && costK != Integer.MAX_VALUE) {
				costThree = Math.min(costThree, cost[j] + costI + costK);
			}

		}
		
		if(costThree == Integer.MAX_VALUE) return -1;

		return costThree;
	}

//		int n = arr.length;
//		// To store the cost of choosing three elements
//		int costThree = Integer.MAX_VALUE;
//
//		// Fix the middle element
//		for (int j = 0; j < n; j++) {
//
//			// Initialize cost of the first
//			// and the third element
//			int costI = Integer.MAX_VALUE;
//			int costK = Integer.MAX_VALUE;
//
//			// Search for the first element
//			// in the left subarray
//			for (int i = 0; i < j; i++) {
//
//				// If smaller element is found
//				// then update the cost
//				if (arr[i] < arr[j])
//					costI = Math.min(costI, cost[i]);
//			}
//
//			// Search for the third element
//			// in the right subarray
//			for (int k = j + 1; k < n; k++) {
//
//				// If greater element is found
//				// then update the cost
//				if (arr[k] > arr[j])
//					costK = Math.min(costK, cost[k]);
//			}
//
//			// If a valid triplet was found then
//			// update the minimum cost so far
//			if (costI != Integer.MAX_VALUE && costK != Integer.MAX_VALUE) {
//				costThree = Math.min(costThree, cost[j] + costI + costK);
//			}
//		}
//
//		// No such triplet found
//		if (costThree == Integer.MAX_VALUE)
//			return -1;
//
//		return costThree;

	}
