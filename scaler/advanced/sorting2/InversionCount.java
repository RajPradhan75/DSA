package datastructures.src.com.scaler.advanced.sorting2;

public class InversionCount {

	public static void main(String[] args) {

		int[] A = { 3, 2, 1 };

		System.out.println(invCount(A, 0, A.length - 1));
//		System.out.println(mergeAndCount(A, 0, A.length - 1));
//		System.out.println(solve(A));

	}

//	private static int mergeAndCount(int[] A, int low, int high) {
//		
//		int mid = low + high / 2;
//		
//		int [] left = new int[mid];
//		int [] right = new int[mid + 1];
//	}

//	public static int solve(int[] A) {
//		return invCount(A, 0, A.length - 1);
//	}

	private static int invCount(int[] A, int start, int end) {
		int MOD = 1000000007;
		if (start == end)
			return 0;

		int mid = (start + end) / 2;
		int x = invCount(A, start, mid) % MOD;
		int y = invCount(A, mid + 1, end) % MOD;
		int z = merge(A, start, mid, end) % MOD;
		return (x + y + z) % MOD;
	}

	private static int merge(int[] A, int start, int mid, int end) {
		int count = 0;
		int p1 = start;
		int p2 = mid + 1;
		int p3 = 0;
		int MOD = 1000000007;
		int[] c = new int[end - start + 1];
		while (p1 <= mid && p2 <= end) {
			if (A[p1] <= A[p2]) {
				c[p3] = A[p1];
				p1++;
				p3++;
			} else {
				c[p3] = A[p2];
				p2++;
				p3++;
				// No of elements = mid - p1 +1
				count += (mid - p1 + 1) % MOD;
			}
		}

		while (p1 <= mid) {
			c[p3] = A[p1];
			p1++;
			p3++;
		}

		while (p2 <= end) {
			c[p3] = A[p2];
			p2++;
			p3++;
		}

		p3 = 0;
		for (int i = start; i <= end; i++) {
			A[i] = c[p3];
			p3++;
		}
		return count % MOD;

	}
}
