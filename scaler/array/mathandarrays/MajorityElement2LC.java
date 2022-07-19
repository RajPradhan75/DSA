package datastructures.src.com.scaler.array.mathandarrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2LC {

	public static void main(String[] args) {

		int[] A = { 3, 2, 3 };
		System.out.println(solve(A));

	}

	public static List<Integer> solve(int[] A) {

		List<Integer> result = new ArrayList<>();
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//
//		for (int n : A)
//			map.put(n, map.getOrDefault(n, 0) + 1);
//		
//		for (Map.Entry<Integer, Integer> entry : map.entrySet())
//			if (entry.getValue() > (A.length / 3))
//				result.add(entry.getKey());

		int major1 = -1, major2 = -1, count1 = 0, count2 = 0;
		int occur1 = 0;
		int occur2 = 0;

		for (int i = 0; i < A.length; i++) {

			if (A[i] == major1)
				count1++;

			else if (A[i] == major2) {
				count2++;
			} else if (count1 == 0) {
				major1 = A[i];
				count1 = 1;
			} else if (count2 == 0) {
				major2 = A[i];
				count2 = 1;
			} else {
				count1--;
				count2--;
			}

		}

		if (count1 > A.length / 3)
			result.add(major1);
		if (count2 > A.length / 3)
			result.add(major2);

		return result;

	}
}
