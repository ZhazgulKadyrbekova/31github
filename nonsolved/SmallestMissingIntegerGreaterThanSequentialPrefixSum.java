package nonsolved;

import java.util.Arrays;

public class SmallestMissingIntegerGreaterThanSequentialPrefixSum {
    public int missingInteger(int[] nums) {
        int sum = 0;
        int maxSum = 0;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            if (value - 1 == nums[index]) {
                sum += nums[index];
                index = i;
            }
            else {
                break;
            }
        }

        sum += nums[index];
        maxSum = Math.max(maxSum, sum);

        for (int i = maxSum; ;i++) {
            if (!contains(nums, i)) {
                return i;
            }
        }

    }

    private boolean contains(int[] nums, int num) {
        return Arrays.stream(nums).anyMatch(i -> i == num);
    }

}
