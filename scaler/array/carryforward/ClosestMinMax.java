package datastructures.src.com.scaler.array.carryforward;

public class ClosestMinMax {

	public static void main(String[] args) {
		int[] A = { 4, 4, 4, 4, 4 };
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {

		int minI = -1, maxI = -1, ans = A.length, length = 0;

		int max = A[0], min = A[0];

		for (int i = 0; i < ans; i++) {
			if (A[i] > max)
				max = A[i];
			else if (A[i] < min) {
				min = A[i];
			}
		}

		for (int i = 0; i<A.length; i++) {

//			if (A[i] == min && minI != -1 ) {
//				minI = i;
//
//				length = Math.abs(minI - maxI) + 1;
//				ans = Math.min(ans, length);
//
//			} else if (A[i] == max && minI != -1 ) {
//				maxI = i;
//
//				length = Math.abs(minI - maxI) + 1;
//				ans = Math.min(ans, length);
//			}
			
			
	        if (A[i] == min)
	            minI = i;
	 
	     
	        if (A[i] == max)
	            maxI = i;
	 
	        if (maxI != -1 && minI != -1)
	            ans = Math.min(ans,
	                  Math.abs(minI - maxI) + 1);
		}

		return ans;
	}

}
