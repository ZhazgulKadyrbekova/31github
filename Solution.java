import done.MinCostClimbingStairs;

public class Solution {
    public static void main(String[] args) {
        var solution = new MinCostClimbingStairs();

        int[] arr = {1,2,3,3,2,2};
//        int[] arr = {10,15,20};
//        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(solution.minCostClimbingStairs(arr));
    }
}
