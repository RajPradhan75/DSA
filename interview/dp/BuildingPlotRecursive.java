package datastructures.src.com.interview.dp;

public class BuildingPlotRecursive {

    public static void main(String[] args) {
        int N = 3;
        System.out.println("Count of ways for "+ N+" sections is "
                +countWays(N));
    }

    public static long countWays(int N) {
        // Base case
        if (N == 1)
            return 4;  // 2 for one side and 4 for two sides

        // countB is count of ways with a building at the end
        // countS is count of ways with a space at the end
        // prev_countB and prev_countS are previous values of
        // countB and countS respectively.

        // Initialize countB and countS for one side
        int countB=1, countS=1, prev_countB, prev_countS;

        // Use the above recursive formula for calculating
        // countB and countS using previous values
        for (int i=2; i<=N; i++)
        {
            prev_countB = countB;
            prev_countS = countS;

            countS = prev_countB + prev_countS;
            countB = prev_countS;
        }

        // Result for one side is sum of ways ending with building
        // and ending with space
        int result = countS + countB;

        // Result for 2 sides is square of result for one side
        return (result*result);
    }
}
