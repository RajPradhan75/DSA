package datastructures.src.com.scaler.advanced.binarysearch1;

public class PeakElement {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 1 };

		System.out.println(solve(A));
	}

	private static int solve(int[] A) {

		int n = A.length;

		int left = 0;
		int right = n - 1;
		int mid = 0;

		while (left <= right) {
			
		  mid = (left + right) / 2;

          if ((mid == 0
                  || A[mid - 1] <= A[mid])
                         && (mid == n - 1
                             || A[mid + 1] <= A[mid]))
                 break;
			
			if(mid > 0 && A[mid - 1] > A[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		
		return mid;

	}

}
