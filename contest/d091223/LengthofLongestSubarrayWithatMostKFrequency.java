package contest.d091223;

import java.util.HashMap;
import java.util.Map;

//Length of Longest Subarray With at Most K Frequency
public class LengthofLongestSubarrayWithatMostKFrequency {
    public static void main(String[] args) {
        int[] nums = new int[]{2,1,1,1,3,4};
        int k = 2;

        System.out.println(maxSubarrayLength(nums, k));
    }

    public static int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        var size = nums.length;
        int i = 0;
        int ans = 1;
        for (int j = 0; j < size; j++) {
            var key = nums[j];
            var value = map.getOrDefault(key, 0);
            map.put(key, value + 1);

            while (i <= j && map.getOrDefault(nums[j], 0) > k) {
                int a = map.get(nums[i]);
                map.put(nums[i], a - 1);
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}