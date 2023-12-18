package done;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {

    public int maxProductDifference(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        var min = nums[0] * nums[1];
        var max = nums[size - 1] * nums[size - 2];
        return max - min;
    }

}
