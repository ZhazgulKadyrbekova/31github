package done;

import java.util.Arrays;

public class DetermineifTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i : word1.toCharArray()) {
            arr1[i - 'a']++;
        }
        for (int i : word2.toCharArray()) {
            arr2[i - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr1[i] == 0 && arr2[i] != 0) {
                return false;
            }
            if (arr1[i] != 0 && arr2[i] == 0) {
                return false;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
