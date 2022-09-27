package datastructures.src.com.scaler.advanced.twopointers;

public class PairsWithGivenSum2 {
	public static void main(String[] args) {
		int[] A = { 1, 1, 1 };
		int B = 2;
		System.out.println(solve(A, B));
	}

	private static int solve(int[] A, int B) {
		int mod = 1000 * 1000 * 1000 + 7;
		int l = 0, r = A.length - 1, ans = 0;
		while (l < r) {
			int sum = A[l] + A[r];
			if (sum == B) {
				int count = 0, prev = r;
				while (prev > l && A[r] == A[prev]) {// count duplicate values from right pointer
					count++;
					prev--;
				}
				ans = (ans + count) % mod;
				l++;
			} else if (sum < B) {
				l++;
			} else if (sum > B) {
				r--;
			}
		}
		return ans;
	}
}
