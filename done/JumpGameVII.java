package done;

import java.util.Arrays;

public class JumpGameVII {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length(), reachable = 0;

        if (s.charAt(n - 1) == '1') return false;

        boolean[] dp = new boolean[n];
        dp[0] = true;

        for (int i = 1; i < n; i++) {
            if (i >= minJump) {
                reachable += dp[i - minJump] ? 1 : 0;
            }
            if (i > maxJump) {
                reachable -= dp[i - maxJump - 1] ? 1 : 0;
            }
            dp[i] = reachable > 0 && s.charAt(i) == '0';
        }


        System.out.println(Arrays.toString(dp));
        return dp[n - 1];
    }

    //Time C:       O(n)        9ms         70.97%
    //Space C:      O(n)        45.47MB     67.40%

}
