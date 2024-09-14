package done;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= cost.length; i++) {
            int fir = cost[i - 1] + dp[i - 1];
            int sec = cost[i - 2] + dp[i - 2];
            dp[i] = Math.min(fir, sec);
        }

        return dp[cost.length];

        //Time      O(n)        0ms         100%
        //Space     O(n)        42.82MB     78.89%
    }
}
