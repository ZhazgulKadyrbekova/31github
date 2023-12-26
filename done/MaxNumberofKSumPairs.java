package done;

import java.util.Arrays;

public class MaxNumberofKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == k) {
                nums[start] = 0;
                nums[end] = 0;
                count++;
                start++;
                end--;
            }
            else if (sum > k) {
                nums[end] = 0;
                end--;
            }
            else {
                nums[start] = 0;
                start++;
            }
        }
        return count;

    }
}
