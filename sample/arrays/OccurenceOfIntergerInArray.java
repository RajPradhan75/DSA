package datastructures.src.com.sample.arrays;

public class OccurenceOfIntergerInArray {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 2, 4, 4, 5, 8, 6 };
		int x = 4;

		System.out.println(countFrequency(arr, x));
	}

	static int countFrequency(int arr[], int x) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				count++;
			}
		}
		return count;

	}

}
