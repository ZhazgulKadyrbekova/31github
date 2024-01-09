package done;

import java.util.Arrays;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = Arrays.stream(nums).sum();
        for (int k = 0; k < nums.length; k++) {
            right -= nums[k];
            if (left == right) {
                return k;
            }
            left += nums[k];
        }

        return -1;
    }
}
