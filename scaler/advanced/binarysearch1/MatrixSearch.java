package datastructures.src.com.scaler.advanced.binarysearch1;

public class MatrixSearch {

	public static void main(String[] args) {
		int[][] A = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
		int B = 3;
		System.out.println(solve(A, B));
	}

	private static int solve(int[][] A, int B) {

		int row = A.length;
		int col = A[0].length;
		int lo = 0;
		int hi = row * col - 1;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;

			if (A == null || A.length == 0)
				return 0;

			if (A[mid / col][mid % col] == B)
				return 1;

			if (A[mid / col][mid % col] < B)
				lo = mid + 1;
			else
				hi = mid - 1;
		}
		return 0;
	}

}
