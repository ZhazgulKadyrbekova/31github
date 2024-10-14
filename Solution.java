import done.CoinChange;

public class Solution {
    public static void main(String[] args) {
        var solution = new CoinChange();

        System.out.println(solution.coinChange(new int[] {3,5},7));
        System.out.println(solution.coinChange(new int[] {1,2,5},11));
        System.out.println(solution.coinChange(new int[] {1,6,7,9,11},13));
        System.out.println(solution.coinChange(new int[] {1,11,6,7,9,10},13));
    }
}
