import done.JumpGameIII;

public class Solution {
    public static void main(String[] args) {
        var solution = new JumpGameIII();

        System.out.println(solution.canReach(new int[] {4,2,3,0,3,1,2},5));
        System.out.println(solution.canReach(new int[] {4,2,3,0,3,1,2},0));
        System.out.println(solution.canReach(new int[] {3,0,2,1,2},2));
    }
}
