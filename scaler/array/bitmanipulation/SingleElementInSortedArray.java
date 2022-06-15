package datastructures.src.com.scaler.array.bitmanipulation;

public class SingleElementInSortedArray {
	
	
	public static void main(String[] args) {
		int[] A = {1,1,2,3,3,4,4,8,8};
		System.out.println(solve(A));
	
	}
	
	
	public static int solve(int[] A) {
		//finding partner index who has different value
		  int start = 0, end = A.length - 1;
		    while (start < end) {
		        int mid = (start + end) >>> 1;
		        if (A[mid] == A[mid ^ 1])
		            start = mid + 1;
		        else
		            end = mid;
		    }
		    return A[start];
		
		
		
	}

}
