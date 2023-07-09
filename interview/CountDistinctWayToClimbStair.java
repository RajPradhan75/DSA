package datastructures.src.com.interview;

public class CountDistinctWayToClimbStair {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(findNCount(n));
    }

    private static int findNCount(long nStairs) {
        long[] dp = new long[(int) (nStairs + 1)];

        if (nStairs == 1) return 1;

        if (nStairs == 2) return 2;

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= nStairs; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return (int) dp[(int) nStairs];
    }
}
