package done;

import java.util.Arrays;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        if (n == 0 || m == 0) return Math.max(n, m);

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) dp[i][0] = i;
        for (int i = 1; i <= m; i++) dp[0][i] = i;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                    continue;
                }

                int min = Integer.MAX_VALUE;
                min = Math.min(min, dp[i - 1][j]);
                min = Math.min(min, dp[i][j - 1]);
                min = Math.min(min, dp[i - 1][j - 1]);
                dp[i][j] = min + 1;
            }
        }

        for (int[] a : dp) {
            System.out.println(Arrays.toString(a));
        }

        return dp[n - 1][m - 1];
    }
    //Time      O(n^2)      6ms         15.59%
    //Space     O(n^2)      45.08MB     33.89%
}
