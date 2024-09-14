package done;

public class LongestSubarrayWithMaximumBitwiseAND {
    public int longestSubarray(int[] nums) {
        int maxElem = 0;
        for (int i : nums) {
            if (i > maxElem) {
                maxElem = i;
            }
        }

        int counter = 0, maxLength = 0;
        for (int i : nums) {
            if (i == maxElem) {
                counter++;
            }
            else {
                counter = 0;
            }
            maxLength = Math.max(maxLength, counter);
        }

        return maxLength;

        //Time      O(n)        3ms         89.89%
        //Space     O(1)        61.17MB     16.85%
    }
}
