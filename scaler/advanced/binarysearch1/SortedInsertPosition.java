package datastructures.src.com.scaler.advanced.binarysearch1;

public class SortedInsertPosition {

	public static void main(String[] args) {
		int[] A = { 1, 3, 5, 6 };
		int B = 5;

		System.out.println(solve(A, B));
	}

	private static int solve(int[] A, int B) {
		int start = 0;
		int end = A.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			// if B is found
			if (A[mid] == B) {
				return mid;
			}

			if (A[mid] < B) {

				start = mid + 1;

			} else {

				end = mid - 1;
			}

		}

		return end + 1;
	}

}
