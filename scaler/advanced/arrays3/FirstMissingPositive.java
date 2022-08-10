package datastructures.src.com.scaler.advanced.arrays3;

public class FirstMissingPositive {

	public static void main(String[] args) {

		int[] A = { 3, 4, -1, 1 };
//		int[] A = { 7, 8, 9, 11, 12 };
		FirstMissingPositive obj = new FirstMissingPositive();

		System.out.println("output :" + obj.solve(A));
	}

	private int solve(int[] A) {

		int n = A.length;

		for (int i = 0; i < n; i++) {

			while (A[i] > 0 && A[i] <= n && A[A[i] - 1] != A[i]) {
				swap(A, i, A[i] - 1);
			}
		}

		for (int i = 0; i < n; i++) {
			if (A[i] != i + 1)
				return i + 1;
		}

		return n + 1;
	}

	private void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

}
