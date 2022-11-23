package datastructures.src.com.scaler.advanced.heaps2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class AthLargestElement {

	public static void main(String[] args) {
		int A = 2;
		int B[] = { 15, 20, 99, 1 };
		System.out.println(Arrays.toString(solve(A, B)));
	}

	private static int[] solve(int A, int[] B) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int res[] = new int[B.length];

		for (int i = 0; i < A; i++) {
			pq.add(B[i]);
			if (i != A - 1)
				res[i] = -1;
		}

		res[A - 1] = pq.peek();

		for (int i = A; i < B.length; i++) {
			pq.add(B[i]);
			pq.poll();
			res[i] = pq.peek();
		}
		return res;
	}
}
