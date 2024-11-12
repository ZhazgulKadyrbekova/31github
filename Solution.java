import nonsolved.PathSumII;
import util.TreeNode;

public class Solution {
    public static void main(String[] args) {
        var solution = new PathSumII();

//        var four = new TreeNode(4, null, null);
        var three = new TreeNode(3, null, null);
        var two = new TreeNode(-3, null, null);
        var one = new TreeNode(-2,two,three);

        var res = solution.pathSum(one, -5);
        System.out.println(res);
    }

}
