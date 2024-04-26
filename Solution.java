import done.BestTimeToBuyAndSellStockII;

public class Solution {
    public static void main(String[] args) {
        var solution = new BestTimeToBuyAndSellStockII();

        System.out.println(solution.maxProfit(new int[] {2,2,5}));
        System.out.println(solution.maxProfit(new int[] {7,1,5,3,2,6,4}));
        System.out.println(solution.maxProfit(new int[] {7,1,3,5,2,6,4}));
        System.out.println(solution.maxProfit(new int[] {7,1,3,5,6,4}));
        System.out.println(solution.maxProfit(new int[] {7,1,5,6,4}));
        System.out.println(solution.maxProfit(new int[] {7,1,5,3,6,4,0}));
        System.out.println(solution.maxProfit(new int[] {7,1,5,3,6,4,0,6}));
        System.out.println(solution.maxProfit(new int[] {7,6,4,3,1}));
    }

}
