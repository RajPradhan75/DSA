package datastructures.src.com.scaler.advanced.arrays1;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOneNumberWith0inBeggining {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(9,9,9,9,9));

		System.out.println(solve(A));
	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {

		int rem = 1;
		for (int i = A.size() - 1; i >= 0; i--) {
			int temp = A.get(i) + rem;
			A.set(i, temp % 10);
			rem = temp / 10;
		}
		A.add(0, rem);

		@SuppressWarnings("unchecked")
		ArrayList<Integer> cloneA = (ArrayList<Integer>) A.clone();
		int i = 0;
		while (cloneA.get(i) == 0 && i < cloneA.size()) {
			A.remove(0);
			i++;
		}
		return A;

	}

}
