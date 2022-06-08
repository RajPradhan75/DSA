package datastructures.src.com.sample.arrays;

import java.util.HashSet;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 4, 3, 5, 6 };
		int n = 7;

		firstRepeated(arr, n);
	}

	public static void firstRepeated(int[] arr, int n) {

		int min = -1;

		HashSet<Integer> set = new HashSet<>();

		for (int i = arr.length - 1; i >= 0; i--) {
			if (set.contains(arr[i]))
				min = i;

			else
				set.add(arr[i]);
		}

		if (min != -1)
			System.out.println("first repeating element: " + arr[min]);
		else
			System.out.println("No repeating elements");
	}
}
