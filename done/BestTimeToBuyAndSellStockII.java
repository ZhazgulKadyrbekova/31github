package done;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int min = 10_000;
        int sum = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= min) {
                min = prices[i];
            }
            else if (prices[i] >= prices[i - 1]) {
                sum += prices[i] - min;
                min = prices[i];
            }
            else {
                min = 10_000;
            }
        }
        return sum;
    }
}
