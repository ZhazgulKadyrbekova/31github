package done;

public class LongestSubarrayof1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int start = 0;
        int end = 0;
        int k = 1;
        while (end < nums.length) {
            if (nums[end] == 0) {
                k--;
            }
            if (k < 0) {
                if (nums[start] == 0) {
                    k++;
                }
                start++;
            }
            end++;
        }
        return end - start - 1;
    }
}
