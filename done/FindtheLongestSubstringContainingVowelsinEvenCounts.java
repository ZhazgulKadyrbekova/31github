package done;

import java.util.*;

public class FindtheLongestSubstringContainingVowelsinEvenCounts {
    public int findTheLongestSubstring(String s) {
        Map<Character, Integer> vowels = new HashMap<>();
        vowels.put('a',1);
        vowels.put('e',2);
        vowels.put('i',4);
        vowels.put('o',8);
        vowels.put('u',16);

        Map<Integer, Integer> firstAppearance = new HashMap<>();
        firstAppearance.put(0, -1);

        int mask = 0, maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (vowels.containsKey(ch)) {
                mask ^= vowels.get(ch);
            }

            if (firstAppearance.containsKey(mask)) {
                maxLength = Math.max(maxLength, i - firstAppearance.get(mask));
            } else {
                firstAppearance.put(mask, i);
            }

            System.out.println(mask);
        }

        return maxLength;
    }

}
