package datastructures.src.com.scaler.advanced.hashing1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DistinctNumbersInWindow {
	public static void main(String[] args) {
		int[] A = { 1, 2, 1, 3, 4, 3 };
		int B = 3;
//		solve(A, B);
		System.out.println(Arrays.toString(solve(A, B)));
	}

	private static int[] solve(int[] arr, int K) {

		ArrayList<Integer> ans = new ArrayList<>();

		// Creates an empty hashMap hM
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

		// Traverse the first window and store count
		// of every element in hash map
		for (int i = 0; i < K; i++)
			hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);

		ans.add(hM.size());

		// Traverse through the remaining array
		for (int i = K; i < arr.length; i++) {

			// Remove first element of previous window
			// If there was only one occurrence
			if (hM.get(arr[i - K]) == 1) {
				hM.remove(arr[i - K]);
			}

			else // reduce count of the removed element
				hM.put(arr[i - K], hM.get(arr[i - K]) - 1);

			// Add new element of current window
			// If this element appears first time,
			// set its count as 1,
			hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);

			ans.add(hM.size());
		}
		
		int[] res = new int[ans.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = ans.get(i);
		}

		return res;
	}

}
