package datastructures.src.com.scaler.advanced.twopointers;

public class CountOfPairsWithKSum {

	public static void main(String[] args) {
		int[] A = { 5, 10, 20, 100, 105 };
		int B = 110;

		System.out.println(solve(A, B));
	}

	private static int solve(int[] A, int B) {
		int i = 0, j = A.length - 1, count = 0;
		

		while (i < j) {

			if (A[i] + A[j] == B) {
				count++;
				i++;
				j--;
			} else if (A[i] + A[j] < B) {
				i++;
			} else {
				j--;
			}

		}

		return count;
	}

}
