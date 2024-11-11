import done.PathSum;
import util.TreeNode;

public class Solution {
    public static void main(String[] args) {
        var solution = new PathSum();

//        var four = new TreeNode(4, null, null);
//        var three = new TreeNode(3, null, null);
        var two = new TreeNode(-3, null, null);
        var one = new TreeNode(-2, null,two);

        var res = solution.hasPathSum(one, -5);
        System.out.println(res);
    }
}
