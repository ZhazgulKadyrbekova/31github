package done;

import java.util.Arrays;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        if (nums.length == 1) {
            return -1;
        }
        Arrays.sort(nums);

        for (int start = 0, end = nums.length - 1;;) {

            if (nums[end] == -nums[start]) {
                return nums[end];
            }
            else if (nums[end] > -nums[start]) {
                end--;
            }
            else if (nums[end] < -nums[start]) {
                start++;
            }

            if (nums[end] < 0 || nums[start] > 0) {
                return -1;
            }
        }
    }
}
