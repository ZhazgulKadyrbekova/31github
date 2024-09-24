package done;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExtraCharactersinaString {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> set = new HashSet<>(Arrays.asList(dictionary));
        int n = s.length();

        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = dp[i + 1] + 1;

            for (int length = 1; length < n - i + 1; length++) {
                if (set.contains(s.substring(i, i + length))) {
                    dp[i] = Math.min(dp[i], dp[i + length]);
                }
            }
        }

        System.out.println(Arrays.toString(Arrays.stream(dp).toArray()));
        return dp[0];
    }
}
