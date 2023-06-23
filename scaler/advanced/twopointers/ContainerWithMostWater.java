package datastructures.src.com.scaler.advanced.twopointers;

public class ContainerWithMostWater {

	public static void main(String[] args) {

		int[] A = {1,8,6,2,5,4,8,3,7}; // o/p : 6
		System.out.println(solve(A));
	}

	private static int solve(int[] A) {

		int left = 0, right = A.length - 1, res = 0;

		while (left < right) {

			int area = (right - left) * Math.min(A[left], A[right]);

			res = Math.max(res, area);

			if (A[left] < A[right])
				left++;
			else
				right--;
		}
		return res;
	}
}
