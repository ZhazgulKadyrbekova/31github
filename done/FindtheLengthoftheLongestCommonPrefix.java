package done;

import java.util.HashSet;
import java.util.Set;

public class FindtheLengthoftheLongestCommonPrefix {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr1) {
            for (int j = i; j > 0; j /= 10) {
                set.add(j);
            }
        }

        int max = 0;
        for (int i : arr2) {
            for (int j = i; j > 0; j /= 10) {
                if (set.contains(j)) {
                    int length = String.valueOf(j).length();
                    if (length > max)
                        max = length;
                    break;
                }
            }
        }
        return max;
    }
}
