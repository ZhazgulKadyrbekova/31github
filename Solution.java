import done.JumpGame;

public class Solution {
    public static void main(String[] args) {
        var solution = new JumpGame();

        System.out.println(solution.canJump(new int[] {10,2,5}));
        System.out.println(solution.canJump(new int[] {2,3,1,1,4}));
        System.out.println(solution.canJump(new int[] {3,2,1,0,4}));
        System.out.println(solution.canJump(new int[] {0,3,2,1,4}));
        System.out.println(solution.canJump(new int[] {3,0,0,0,4}));
        System.out.println(solution.canJump(new int[] {2,0,1,0,4}));
        System.out.println(solution.canJump(new int[] {3,0,1,0,4}));
        System.out.println(solution.canJump(new int[] {3,0,0,1,4}));
    }
}
