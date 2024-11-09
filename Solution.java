import done.MaximumSubarray;

public class Solution {
    public static void main(String[] args) {
        var solution = new MaximumSubarray();

//        var res = solution.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
//        var res = solution.maxSubArray(new int[] {1});
        var res = solution.maxSubArray(new int[] {5,4,-1,7,8});
        System.out.println(res);
    }
}
