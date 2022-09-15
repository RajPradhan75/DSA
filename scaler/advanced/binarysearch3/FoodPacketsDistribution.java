package datastructures.src.com.scaler.advanced.binarysearch3;

public class FoodPacketsDistribution {

	public static void main(String[] args) {
		int[] A = { 10000, 20000, 30000 };
		int B = 6;
		System.out.println(solve(A, B));
	}

	private static int solve(int[] A, int B) {

		int ans = -1;
		int left = 0;
		int right = Integer.MAX_VALUE;

		for (int i = 0; i < A.length; i++) {
			right = Math.min(right, A[i]);
		}

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (isPossible(A, B, mid)) {
				ans = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		if (ans == -1)
			return 0;
		else
			return ans;

	}

	private static boolean isPossible(int[] A, int B, int mid) {
		
		int sum = 0;
		
		for(int i = 0 ; i<A.length; i++) {
			if(mid == 0) {
				sum += A[i];
			}else {
				sum += (A[i] / mid);
			}
		}
		
		return sum >= B;

	}

}
