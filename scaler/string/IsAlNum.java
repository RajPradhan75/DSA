package datastructures.src.com.scaler.string;

public class IsAlNum {

	public static void main(String[] args) {
		char[] A = { 'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '#' };

		System.out.println(solve(A));
	}

	public static int solve(char[] A) {
		int count = 0;

		for (int i = 0; i < A.length; i++) {

		
			if (A[i] >= 65 && A[i] <= 122 ||  '0'<=A[i] && A[i]<='9') 
				count++;

		}
		

		if (count == A.length)
			return 1;
		else
			return 0;

	}

}
