package datastructures.src.com.sample.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionAndIntersection {

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 4, 5, 7 };
		int arr2[] = { 2, 3, 5, 6 };
		System.out.println("Union:");
		union(arr1, arr2);
		List<Integer> finalIntersection = new ArrayList<>();
		System.out.println("Intersection:");
		intersection(arr1, arr2, finalIntersection);
		System.out.println(finalIntersection);
	
	}

	static void union(int arr1[], int arr2[]) {

		Set<Integer> set = new HashSet<Integer>();
		for (int x : arr1) {
			set.add(x);
		}

		for (int x : arr2) {
			set.add(x);
		}

		System.out.println(set);

	}

	static void intersection(int arr1[], int arr2[], List<Integer> finalList) {

		int i = 0;
		int j = 0;

		while (i < arr1.length && j < arr2.length) {
			while ((i < arr1.length - 1 && arr1[i] == arr1[i + 1]))
				i++;

			while ((j < arr2.length - 1) && (arr2[j] == arr2[j + 1])) {
				j++;
			}

			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				finalList.add(arr1[i]);
				i++;
				j++;
			}

		}
	}
}
