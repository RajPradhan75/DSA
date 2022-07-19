package datastructures.src.com.scaler.string;

public class ToLower {
	
	public static void main(String[] args) {
		char[] A = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
		
		System.out.println(solve(A));
	}
	
	public static char[] solve (char [] A) {
		
		
		for(int i = 0 ; i<A.length ; i++) {
			
			if(A[i]>=65 && A[i]<=90) {
				int temp = A[i];
				A[i] = (char)(temp+32);
			}
			
			
		}

		return A;
	}

}
