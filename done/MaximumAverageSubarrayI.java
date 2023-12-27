package done;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int sum = 0;
        for (; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;

        for (;i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}