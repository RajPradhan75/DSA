package datastructures.src.com.scaler.array.subarray;

import java.util.ArrayList;

public class MaximumPositivity {

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(5);
		A.add(6);
		A.add(-1);
		A.add(7);
		A.add(8);

		System.out.println(solve(A));
	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		int n = A.size();

		int start = -1, end = -1, minStart = -1, minEnd = -1, max = Integer.MIN_VALUE;

		ArrayList<Integer> sub = new ArrayList<>();

		for (int i = 0; i < n;) {
			if (A.get(i) >= 0) {
				start = i;
				while (i < n && A.get(i) >= 0) {
					i++;
				}

				end = i - 1;

				if (max < (end - start + 1)) {
					minStart = start;
					minEnd = end;
					max = end - start + 1;
				}
			} else {
				i++;
			}
		}

		for (int i = minStart; i <= minEnd; i++) {
			sub.add(A.get(i));
		}

		return sub;
	}

}
