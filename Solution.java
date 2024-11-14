import done.SumofRootToLeafBinaryNumbers;
import util.TreeNode;

public class Solution {
    public static void main(String[] args) {
        var solution = new SumofRootToLeafBinaryNumbers();

        var three = new TreeNode(1, null, null);
        var two = new TreeNode(0, null, null);
        var one = new TreeNode(1,two,three);

        var res = solution.sumRootToLeaf(one);
        System.out.println(res);
    }

}
