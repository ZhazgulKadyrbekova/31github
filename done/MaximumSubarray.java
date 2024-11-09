package done;

import java.util.Arrays;

public class MaximumSubarray {

    //divide and conquer
    public int maxSubArray(int[] nums) {
        return divideAndConquer(nums, 0, nums.length - 1);
    }
    //T:    O(nlogn)    12ms        6.12%
    //S:    O(logn)     56.74MB     80.02%
    private int divideAndConquer(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int mid = (right + left) / 2;

        int leftSum = divideAndConquer(nums, left, mid);
        int rightSum = divideAndConquer(nums, mid + 1, right);
        int crossSum = crossSum(nums, left, mid, right);

        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }
    private int crossSum(int[] nums, int left, int mid, int right) {
        int leftMaxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            leftMaxSum = Math.max(leftMaxSum, sum);
        }

        int rightMaxSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            rightMaxSum = Math.max(rightMaxSum, sum);
        }

        return leftMaxSum + rightMaxSum;
    }

    //dp 2
    public int maxSubArray2(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int sum = nums[0];
        int max = sum;

        for (int i = 1; i < n; i++) {
            sum = nums[i] + Math.max(0, sum);
            max = Math.max(max, sum);
        }

//        System.out.println(sum);
        return max;
    }
    //T:    O(n)    1ms        99.37%
    //S:    O(1)    57.47MB     8.67%


    //dp 1
    public int maxSubArray1(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int[] dp = new int[n];
        int max = dp[0] = nums[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(Arrays.toString(dp));
        return max;
    }
    //T:    O(n)    35ms        6.12%
    //S:    O(n)    61.65MB     5.47%
}
