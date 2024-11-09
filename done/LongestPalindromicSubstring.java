package done;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
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
