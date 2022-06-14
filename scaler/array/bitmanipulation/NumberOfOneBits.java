package datastructures.src.com.scaler.array.bitmanipulation;

public class NumberOfOneBits {

	public static void main(String[] args) {
		int A = 11;

		System.out.println(solve(A));
	}

	public static int solve(int A) {

//		int count = 0;
//		while (A > 0) {
//			if (A % 2 == 1)
//				count++;
//			A /= 2;
//		}
//		return count;

		int ones = 0;
		
		while(A!=0) {
			ones += (A & 1);
			A = A>>>1;
		}
		
		
		return ones;

	}

}
