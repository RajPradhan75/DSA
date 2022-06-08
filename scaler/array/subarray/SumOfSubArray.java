package datastructures.src.com.scaler.array.subarray;

public class SumOfSubArray {

	public static void main(String[] args) {
		int[] A = { 2, 9, 5 };
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
		
		for(int i = 0; i<A.length;i++) {
			sum += (A[i] * (i+1) * (A.length-i));
		}
		
		return sum;

	}

}
