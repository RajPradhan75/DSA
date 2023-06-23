package datastructures.src.com.scaler.advanced.dynamicprogramming;

public class ClimbStairs {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(solve(n));
        // Distinct ways to reach top: [1 1 1], [1 2], [2 1].
//		Explanation: There are three ways to climb to the top.
//		1. 1 step + 1 step + 1 step
//		2. 1 step + 2 steps
//		3. 2 steps + 1 step
    }

//	public static int solve(int n) {
//
//		int prev = 1;
//		int prev2 = 1;
//
//		for (int i = 2; i <= n; i++) {
//			int curr = prev + prev2;
//			prev2 = prev;
//			prev = curr;
//		}
//		return prev;
//	}

    public static int solve(int n) {
        int[] dp = new int[n + 1];
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }

}
