package datastructures.src.com.scaler.advanced.hashing2;

import java.util.HashSet;
import java.util.Set;

public class CountRectangle {

	public static void main(String[] args) {

		int[] A = { 1, 1, 2, 2, 3, 3 };
		int[] B = { 1, 2, 1, 2, 1, 2 };
		System.out.println(solve(A, B));
	}

	private static int solve(int[] x, int[] y) {

		int res = 0;
		Set<String> set = new HashSet<>();

		for (int i = 0; i < x.length; i++) 
			set.add(x[i] + "" + y[i]);

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < y.length; j++) {
				if (x[i] != x[j] && y[i] != y[j]) {
					if (set.contains(x[i] + "" + y[j]) 
							&& set.contains(x[j] + "" + y[i])) 
						res++;
				}
			}
		}
		return res / 2;
	}

}
