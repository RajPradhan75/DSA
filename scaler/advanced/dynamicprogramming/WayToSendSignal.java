package datastructures.src.com.scaler.advanced.dynamicprogramming;

import java.util.Arrays;

public class WayToSendSignal {

	/*
	 * In this problem, signalCount(i) represents the number of ways to send a
	 * signal using the first i+1 lights, such that no two consecutive lights are
	 * on.
	 * 
	 * The base cases signalCount(0) and signalCount(1) represent the number of ways
	 * to send a signal using the first 1 or 2 lights, respectively.
	 * 
	 * For signalCount(0), we have only one light, and there are 2 ways to send a
	 * signal using this light: either the light is off, or the light is on.
	 * Therefore, signalCount(0) should return 2.
	 * 
	 * For signalCount(1), we have two lights. If the first light is off, then the
	 * second light can be either on or off (2 ways). If the first light is on, then
	 * the second light must be off (1 way). Therefore, signalCount(1) should return
	 * 3.
	 * 
	 * I hope this helps! Let me know if you have any other questions.
	 */

	/*
	 * Yes, that's correct! The problem of counting the number of ways to send a
	 * signal using the first i+1 lights, such that no two consecutive lights are
	 * on, is a variation of the Fibonacci sequence.
	 * 
	 * In the Fibonacci sequence, each number is the sum of the previous two
	 * numbers, starting with the base cases F(0) = 0 and F(1) = 1.
	 * 
	 * In this problem, the base cases are signalCount(0) = 2 and signalCount(1) =
	 * 3, and each subsequent number is the sum of the previous two numbers.
	 * 
	 * For example, the first few numbers in the sequence would be:
	 * 
	 * signalCount(0) = 2 signalCount(1) = 3 signalCount(2) = 5 (2 + 3)
	 * signalCount(3) = 8 (3 + 5) signalCount(4) = 13 (5 + 8)
	 * 
	 * and so on.
	 * 
	 * I hope this helps! Let me know if you have any other questions.
	 */

	public static void main(String[] args) {
//		int A = 2;
		// OFF OFF
		// OFF ON
		// ON OFF
		
		 int A = 3;
//		 OFF OFF OFF
//		 OFF OFF ON
//		 OFF ON OFF 
//		 ON OFF OFF
//		 ON OFF ON
		
		int mod = 1000000007;
		int dp[] = new int[A];
		Arrays.fill(dp, -1);
		System.out.println(solve(A - 1, mod, dp));
	}

	public static int solve(int i, int mod, int[] dp) {

		if (i == 0)
			return 2;

		if (i == 1)
			return 3;

		if (dp[i] == -1) {
			dp[i] = (solve(i - 1, mod, dp) % mod + solve(i - 2, mod, dp) % mod) % mod;
		}

		return dp[i] % mod;

	}

}
