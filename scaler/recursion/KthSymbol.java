package datastructures.src.com.scaler.recursion;

public class KthSymbol {

	public static void main(String[] args) {

		int A = 4, B = 3;
//		int A = 2, B = 2;

		System.out.println(solve(A, B));
	}

	public static int solve(int n, int k) {

		if (n == 1 || k == 1)
			return 0;

		int mid = (int) Math.pow(2, n - 1) / 2;

		if (k <= mid)
			return solve(n - 1, k);
		else
			return 1 - solve(n - 1, k - mid);

	}

}
