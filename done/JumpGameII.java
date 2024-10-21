package done;

import java.util.Arrays;

public class JumpGameII {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < nums.length; i++) {
            int step = nums[i];
            for (int j = i + 1; j <= i + step && j < nums.length; j++) {
                dp[j] = Math.min(dp[j], 1 + dp[i]);
            }
        }

        System.out.println(Arrays.toString(dp));
        return dp[nums.length - 1];
    }

    //Time C    O(n * n)
    //Space C   O(n)
}
