package mock;

public class CoinChangeII {
    public static int solve(int[][] dp, int[] coins, int target, int index) {
        if (target == 0) {
            return 1;
        }

        if (index >= coins.length) {
            return 0;
        }

        if (dp[target][index] != -1) {
            return dp[target][index];
        }

        int differentWays = 0;
        for (int i = 0; i <= target / coins[index]; i++) {
            int newTarget = target - coins[index] * i;
            differentWays += solve(dp, coins, newTarget, index + 1);
        }

        dp[target][index] = differentWays;
        return differentWays;
    }

    public static void main(String[] args) {
        int[] coins = new int[] {1,2,5};
        int target = 5;

        int[][] dp = new int[target + 1][coins.length];
        for (int i = 0; i <= target; i++){
            for (int j = 0; j < coins.length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(solve(dp, coins, target, 0));

        /*
        coins = [2, 5, 6]
        target = 10

        coins = [3, 2]
        target = 10

        2,2,2,2,3
        2,3,3,3


        2, 2, 2, 2, 2
        2,2,3,3



        1 + 1+ 1 +1
        1+ 1 + 2
        2 + 2



        output: 3
        2 + 2 + 2 + 2 + 2
        5 + 5
        6 + 2 + 2
         */


    }
}
