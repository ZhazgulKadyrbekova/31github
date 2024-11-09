package done;

public class LongestPalindromicSubstring {

    //dp
    public String longestPalindrome(String s) {
        int n = s.length();

        if (n == 1) return s;

        boolean[][] dp = new boolean[n][n];

        int maxLength = 0, start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[i - 1][j + 1])) {
                    dp[i][j] = true;
                    if (i - j + 1 > maxLength) {
                        maxLength = i - j + 1;
                        start = j;
                        end = i;
                    }
                }
            }
        }

        return s.substring(start, end + 1);
    }
    //T:    O(n^2)      101ms       43.35%
    //S:    O(n^2)      46.00MB     16.99%


    // expand
    public String longestPalindrome2(String s) {
        int n = s.length();

        if (n == 1) return s;

        int maxLength = 1;
        String maxString = s.substring(0,1);

        for (int i = 0; i < n; i++) {
            int j = i - 1, k = i + 1;
            while (j >= 0 && k < n && s.charAt(j) == s.charAt(k)) {
                if (k - j + 1 > maxLength) {
                    maxLength = k - j + 1;
                    maxString = s.substring(j, k + 1);
                }
                j--;
                k++;
            }

            j = i; k = i + 1;
            while (j >= 0 && k < n && s.charAt(j) == s.charAt(k)) {
                if (k - j + 1 > maxLength) {
                    maxLength = k - j + 1;
                    maxString = s.substring(j, k + 1);
                }
                j--;
                k++;
            }
        }

        return maxString;
    }
        //T:    O(n^2)      19ms        59.94%
        //S:    O(1)        44.42MB     62.18%
}
