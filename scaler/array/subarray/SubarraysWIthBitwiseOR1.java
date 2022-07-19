package datastructures.src.com.scaler.array.subarray;

public class SubarraysWIthBitwiseOR1 {

	public static void main(String[] args) {
		int A = 3;
		int[] B = { 1, 0, 1 };

		System.out.println(solve(A, B));
	}

	static long solve(int A, int[] B) {

		long total = 0;
		long prev = 0;

		for (int i = 0; i < A; i++) {

			if (B[i] == 0)
				total += prev;
			else {
				prev = i + 1;
				total += prev;
			}
		}

		return total;
	}

}
