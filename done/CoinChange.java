package done;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++)
            dp[i] = amount + 1;

        for (int coin : coins) {
            for (int j = coin; j < amount + 1; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin] + 1);
            }
        }

        if (dp[amount] == amount + 1) {
            return -1;
        }
        return dp[amount];
    }
    //Time C:       O(coins.length * amount)    96.42%      11ms
    //Space C:      O(amount)                   73.42%      44.18MB
}
