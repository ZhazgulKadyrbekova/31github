package done;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] stairDistinctWays = new int[n];
        stairDistinctWays[0] = 1;
        stairDistinctWays[1] = 2;

        for (int i = 2; i < n; i++) {
            stairDistinctWays[i] = stairDistinctWays[i - 1] + stairDistinctWays[i - 2];
            System.out.println(i + "\t" + stairDistinctWays[i]);
        }

        return stairDistinctWays[n - 1];

        //Time - O(n)       0ms         100%
        //Space - O(n)      39.73MB     98.55%
    }
}
