package datastructures.src.com.scaler.array.prefixsum;

public class EquillibriumIndex {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7, 1, 2, 3 };
		System.out.println(solution(arr));

	}

	public static int solution(int[] arr) {

		int leftSum = 0, rightSum = 0;

		int[] prefix_sum = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (i == 0)
				prefix_sum[i] = arr[i];
			else
				prefix_sum[i] = prefix_sum[i - 1] + arr[i];

		}
		
		int totalSum = prefix_sum[arr.length - 1];
		
		for (int i = 0; i < arr.length; i++) {
			
			leftSum = prefix_sum[i] - arr[i];
			rightSum = totalSum - prefix_sum[i];

			if (leftSum == rightSum)
				return i;

		}

		return -1;
		
		// best approach

//		int left = 0, sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		for (int i = 0; i < arr.length; i++) {
//			sum -= arr[i];
//			if (sum == left)
//				return i;
//			left += arr[i];
//		}
//		return -1;
		
		
		
	}
}