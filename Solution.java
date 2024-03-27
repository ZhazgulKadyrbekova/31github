import done.SubarrayProductLessThanK;

public class Solution {
    public static void main(String[] args) {
        var solution = new SubarrayProductLessThanK();

        int[] nums = new int[] {10,5,2,6};
        var res = solution.numSubarrayProductLessThanK(nums, 4);
        System.out.println(res);
    }

}
