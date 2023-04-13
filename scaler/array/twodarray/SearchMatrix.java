package datastructures.src.com.scaler.array.twodarray;

public class SearchMatrix {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 5;
		System.out.println(solve(matrix, target));
	}

	public static boolean solve(int[][] matrix, int target) {

		int rows = matrix.length;
		int col = matrix[0].length;

		int low = 0;
		int high = rows * col - 1;

		while (low <= high) {
			int mid = (low + (high - low) / 2);

			if (matrix == null || matrix.length == 0)
				return false;

			if (matrix[mid / col][mid % col] == target)
				return true;

			if (matrix[mid / col][mid % col] < target)
				low = mid + 1;
			else
				high = mid - 1;

		}

		return false;
	}
}
