import done.BinaryTreePreorderTraversal;

import util.TreeNode;

public class Solution {
    public static void main(String[] args) {
        var solution = new BinaryTreePreorderTraversal();

        var three = new TreeNode(3, null, null);
        var two = new TreeNode(2, three, null);
        var one = new TreeNode(1, null, two);

        var res = solution.preorderTraversal(one);
        System.out.println(res);
    }
}
