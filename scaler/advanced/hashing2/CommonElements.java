package datastructures.src.com.scaler.advanced.hashing2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElements {

	public static void main(String[] args) {

		List<Integer> A = Arrays.asList(1, 2, 2, 1);
		List<Integer> B = Arrays.asList(2, 3, 1, 2);

		System.out.println(solve(A, B));

	}

	private static List<Integer> solve(List<Integer> A,List<Integer> B) {

		Map<Integer, Integer> map = new HashMap<>();

		List<Integer> res = new ArrayList<>();

		for (Integer listA : A) {
			map.put(listA, map.getOrDefault(listA, 0) + 1);
		}

		for (Integer listB : B) {
			if (map.containsKey(listB) && map.get(listB) > 0) {
				res.add(listB);
				int decrement = map.get(listB) - 1;
				map.put(listB, decrement);
			}
		}

		return res;

	}

}
