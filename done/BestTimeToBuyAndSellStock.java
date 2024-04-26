package done;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = 10_000;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            else {
                if (profit < prices[i] - min) {
                    profit = prices[i] - min;
                }
            }
        }
        return profit;
    }
}
