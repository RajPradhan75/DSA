package datastructures.src.com.scaler.array.subarray;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] C = { 7, 10, 3, 1 };
		int B = 11;
		int A = C.length;
		System.out.println(solution(C, B, A));

	}

	public static int solution(int[] C, int B, int A) {

		int max_sum = C[0];
		int current_sum = max_sum;

		for (int i = 1; i < A; i++) {

			current_sum = Math.max(C[i] + current_sum, C[i]);
			max_sum = Math.max(current_sum, max_sum);

		}

		return max_sum;
	

	}

}
