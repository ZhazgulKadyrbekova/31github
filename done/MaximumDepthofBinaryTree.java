package done;

import util.TreeNode;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        return solve(root, 0);
    }

    private int solve(TreeNode node, int depth) {
        if (node == null) return depth;

        return Math.max(solve(node.left, depth + 1),
                solve(node.right, depth + 1));
    }
}
