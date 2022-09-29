package datastructures.src.com.scaler.advanced.bitsmanipulation1;

public class DifferentBitsSumPairwise {
	
	/*
	 * We define f(X, Y) as the number of different corresponding bits in the binary
	 * representation of X and Y. For example, f(2, 7) = 2, since the binary
	 * representation of 2 and 7 are 010 and 111, respectively. The first and the
	 * third bit differ, so f(2, 7) = 2.
	 * 
	 * You are given an array of N positive integers, A1, A2,..., AN. Find sum of
	 * f(Ai, Aj) for all pairs (i, j) such that 1 ≤ i, j ≤ N. Return the answer
	 * modulo 109+7.
	 */
	public static void main(String[] args) {
		int []A = {1, 3, 5};
//		f(1, 1) + f(1, 3) + f(1, 5) + f(3, 1) + f(3, 3) + f(3, 5) + f(5, 1) + f(5, 3) + f(5, 5) 
//		 = 0 + 1 + 1 + 1 + 0 + 2 + 1 + 2 + 0 = 8
		//o/p:8
		
		
		solve(A);
	}
	
	private static int solve(int[]A) {
		   int mod = 1000000007;
		    int n = A.length;
		    long total = 0;
		    for (int i = 0; i < 32; i++) {
		        int setBits = 0;
		        for (int j = 0; j < A.length; j++) {
		            if ((A[j] & (1 << i)) > 0) {
		                setBits++;
		            }
		        }
		        total += 2 * (long)setBits * (n - (long)setBits);
		        total = (total % mod);
		    }
		    return (int) (total);
	}
}
