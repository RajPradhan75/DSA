package datastructures.src.com.scaler.array.subarray;

public class SumOfSubArray {

	public static void main(String[] args) {
		int[] A = { 2, 1, 3}; //  [2] + [1] + [3] + [2 + 1]  + [1 + 3] + [2 + 1 + 3] = 19
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {

//		int sum = 0, temp = 0;
//
//		for (int s = 0; s < A.length; s++) {
//			temp = 0;
//			for (int i = s; i < A.length; i++) {
//				temp+=A[i];
//				sum += temp;
//			}
//		}
//		return sum;
		

		
		
		
		int sum = 0; 
		
		int n = A.length;		
		for(int i = 0; i<A.length;i++) {
			sum += (A[i] * (i+1) * (n-i));
		}
		
		return sum;

	}

}
