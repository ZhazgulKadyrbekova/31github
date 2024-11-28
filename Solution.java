import done.PathSumIII;
import util.TreeNode;

public class Solution {
    public static void main(String[] args) {
        var solution = new PathSumIII();

        var ten = new TreeNode(1, null, null);
        var nine = new TreeNode(5, null, null);
        var eight = new TreeNode(4, nine, ten);
        var seven = new TreeNode(13, null, null);
        var six = new TreeNode(8, seven, eight);
        var five = new TreeNode(7, null, null);
        var four = new TreeNode(2, null, null);
        var three = new TreeNode(11, five, four);
        var two = new TreeNode(4, three, null);
        var one = new TreeNode(5, two, six);

        var res = solution.pathSum(one, 13);
        System.out.println(res);
    }

}
