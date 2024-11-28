package done;

import util.TreeNode;

public class PathSumIII {
    private int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        solve(root, 0, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return count;
    }

    private void solve(TreeNode node, long sum, int target) {
        if (node == null) return;

        sum += node.val;

        if (sum == target) count++;

        solve(node.left, sum, target);
        solve(node.right, sum, target);
    }
}
