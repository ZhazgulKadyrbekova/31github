package done;

import util.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return dfs(root, 0, targetSum);
    }

    private boolean dfs(TreeNode node, int sum, int targetSum) {
        int newSum = node.val + sum;
        if (node.left == null && node.right == null)
            if (newSum == targetSum)
                return true;
            else return false;

        var res = false;
        if (node.left != null) res = res || dfs(node.left, newSum, targetSum);
        if (node.right != null) res = res || dfs(node.right, newSum, targetSum);
        return res;
    }
    //T:    O(n)    0ms         100.00%
    //S:    O(n)    42.93MB     64.88%
}
