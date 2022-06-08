package datastructures.src.com.scaler.array.general;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumPicks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_cases = sc.nextInt();
		int i = 1;
		while (i++ <= test_cases) { 
			int n = sc.nextInt();
			int[] A = new int[n];
			List<Integer> even = new ArrayList<>();
			List<Integer> odd = new ArrayList<>();

			for (int j = 0; j < n; j++) {
				A[j] = sc.nextInt();
				if (A[j] % 2 == 0)
					even.add(A[j]);
				else
					odd.add(A[j]);
			}
			for (int k = 0; k < odd.size(); k++)
				System.out.print(odd.get(k) + " ");
			System.out.println();
			for (int k = 0; k < even.size(); k++)
				System.out.print(even.get(k) + " ");
			System.out.println();
		}

	}

}
