package datastructures.src.com.scaler.bitmanipulation;

public class InterestingArray {
	
	public static void main(String[] args) {
		int [] A = {9,17};
		System.out.println(solve(A));
	
	}
	
	
//	Observations:
//		A^B = 0, only when A is same as B.
//		C=A+B, C should be divided equally so that merging operation would result in 0.
//
//
//		Approach:
//		1. Merge all the elements.
//		2. Split the resultant element
//		3. Only is the results of step #1 is even number, equal split is possible in step #2.
//		4. Again merge the resultant elements in step #2.
	
	
	public static String solve(int []A) {
		int result = 0;
		for(int i = 0; i<A.length;i++) {
			result ^= A[i];
		}
		
		if(result % 2 == 0)
			return "Yes";
		else
			return "No";
	}

}
