package done;

public class MaximumProductofTwoElementsinanArray {
    public int maxProduct(int[] nums) {
        int res = 1;
        for (int k = 0; k < 2; k++) {
            res *= findMax(nums);
        }

        return res;
    }

    public int findMax(int[] nums) {
        int max = 0;
        int iMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                iMax = i;
            }
        }

        nums[iMax] = -1;
        return max - 1;
    }
}
