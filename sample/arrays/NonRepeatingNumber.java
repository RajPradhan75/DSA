package datastructures.src.com.sample.arrays;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingNumber {

	public static void main(String[] args) {

		int arr[] = { -1, 2, -1, 3, 2 };
		int n = arr.length;

		firstNonRepeating(arr, n);
	}

	public static int firstNonRepeating(int arr[], int n) {

		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			if (hash.containsKey(arr[i])) {
				hash.put(arr[i], hash.get(arr[i]) + 1);
			}
			else {
				hash.put(arr[i], 1);
			}
		}
		
		
//		for(int i = 0; i<n;i++) {
//			if(hash.get(arr[i]) == 1) {
//				return arr[i];
//			}
//		}
		
		// Traverse through map only and
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<Integer, Integer> x : hash.entrySet())
            if (x.getValue() == 1)
                System.out.print(x.getKey() + " ");

		return -1;

	}

}
