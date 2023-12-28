package done;

public class MaximumNumberofVowelsinaSubstringofGivenLength {
    public int maxVowels(String s, int k) {
        int i = 0;
        int j = s.length();
        int cur = 0;
        int max = 0;

        for (; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                cur++;
            }
        }
        max = cur;

        for (; i < j; i++) {
            var start = s.charAt(i - k);
            if (isVowel(start)) {
                cur--;
            }
            var end = s.charAt(i);
            if (isVowel(end)) {
                cur++;
            }
            max = Math.max(max, cur);
        }

        return max;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}