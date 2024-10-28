import done.JumpGameIV;

public class Solution {
    public static void main(String[] args) {
        var solution = new JumpGameIV();

//        var res = solution.minJumps(new int[] {100,-23,-23,404,100,23,23,23,3,404});
        var res = solution.minJumps(new int[] {100,23,23,23,23,23,23,404});
        System.out.println(res);
    }
}
