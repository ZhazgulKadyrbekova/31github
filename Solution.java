import done.LargestPositiveIntegerThatExistsWithItsNegative;

public class Solution {
    public static void main(String[] args) {
        var solution = new LargestPositiveIntegerThatExistsWithItsNegative();

        System.out.println(solution.findMaxK(new int[] {3,3,3,3,3,3,3,3}));
        System.out.println(solution.findMaxK(new int[] {3, -4}));
        System.out.println(solution.findMaxK(new int[] {-10,8,6,7,-2,-3}));
        System.out.println(solution.findMaxK(new int[] {1,-1,2,-2,3}));
    }

}
