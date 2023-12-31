import done.MaxConsecutiveOnesIII;

public class Solution {
    public static void main(String[] args) {
        var solution = new MaxConsecutiveOnesIII();

        int[] nums = new int[] {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(solution.longestOnes(nums, 2));
        System.out.println(solution.longestOnes(nums, 3));
    }

}
