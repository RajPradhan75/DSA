package datastructures.src.com.scaler.array.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ElementRemoval {

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>();

		A.add(2);
		A.add(1);

		System.out.println(solve(A));

	}

	public static int solve(ArrayList<Integer> A) {

		Collections.sort(A);

		Collections.reverse(A);

		int cost = 0;

		for (int i = 0; i < A.size(); i++) {

			cost += ((i + 1) * A.get(i));
		}

		return cost;
	}

}
