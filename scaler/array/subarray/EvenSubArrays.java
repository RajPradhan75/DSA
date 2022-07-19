package datastructures.src.com.scaler.array.subarray;

public class EvenSubArrays {
	
	public static void main(String[] args) {
		int []A = {2,4,8,6};
		System.out.println(solve(A));
	
	}
	
	public static String solve(int[]A) {
		
		if(A.length%2!=0) return "NO";
		
		if(A[0]%2 == 0 || (A[A.length-1]%2 ==0))
			return "YES";
		
		
		
		
		return "NO";
	}

}
