import done.EqualRowAndColumnPairs;

public class Solution {
    public static void main(String[] args) {
        var solution = new EqualRowAndColumnPairs();

        int[][] grid1 = new int[][] {{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(solution.equalPairs(grid1));

        int[][] grid2 = new int[][] {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.println(solution.equalPairs(grid2));
    }
}
