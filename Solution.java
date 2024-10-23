import done.BinaryTreePostorderTraversal;
import util.TreeNode;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        var solution = new BinaryTreePostorderTraversal();

        var four = new TreeNode(4, null, null);
        var three = new TreeNode(3, null, null);
        var two = new TreeNode(2, four, null);
        var one = new TreeNode(1, three, two);

        var res = solution.postorderTraversal(one);
        System.out.println(res);
        System.out.println(res.equals(List.of(3,4,2,1)));
    }
}
