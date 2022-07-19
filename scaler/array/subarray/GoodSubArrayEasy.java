package datastructures.src.com.scaler.array.subarray;

public class GoodSubArrayEasy {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5 };

		int B = 4;

		System.out.println(solve(A, B));
	}

	public static int solve(int[] A, int B) {

		int n = A.length;

		int count = 0;

		for (int i = 0; i < n; i++) {

			int sum = 0;
			int subArrays = 0;

			for (int j = i; j < n; j++) {
				sum += A[j];
				subArrays++;

				if ((subArrays % 2 == 0 && sum < B) || (subArrays % 2 != 0 && sum > B)) {
					count++;
				}
			}
		}

		return count;

	}

}
