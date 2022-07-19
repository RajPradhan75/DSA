package datastructures.src.com.scaler.recursion;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

	public static void main(String[] args) {

		int n = 3;

		System.out.println(solve(n));
	}

	public static List<Integer> solve(int n) {

		List<Integer> result = new ArrayList<>();
		result.add(0);

		for (int i = 0; i < n; i++) {
			int size = result.size();
			for (int k = size - 1; k >= 0; k--) {
				result.add(result.get(k) | 1 << i);
			}
		}

		return result;

	}

}
