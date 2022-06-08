package datastructures.src.com.sample.arrays;

public class SubArraySum {

	public int subArraySum(int arr[], int sum, int n) {

		int current_sum = 0, i, j;

		for (i = 0; i < n; i++) {
			current_sum = arr[i];
			for (j = i + 1; j <= n; j++) {
				if (current_sum == sum) {
					int p = j - 1;
					System.out.println("Sum found between indexes " + "" + i + " and " + p);
					return 1;
				}
				if (current_sum > sum || j == n)
					break;
				current_sum = current_sum + arr[j];

			}

		}


		System.out.println("No subarray found");
		return 0;

	}

	public static void main(String[] args) {

		SubArraySum arraysum = new SubArraySum();
		int[] arr = { 7, 1, 8, 5, 8, 5, 3, 3, 5 };
		int n = arr.length;
		int sum = 78;
		System.out.println(arraysum.subArraySum(arr, sum, n));

	}

}
