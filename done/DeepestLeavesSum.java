package done;

import util.TreeNode;

public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) return 0;

        int maxDepth = getMaxDepth(root,0,0);
        return getMaxSum(root, maxDepth,0, 0);
    }

    private int getMaxSum(TreeNode node, int maxDepth, int currentDepth, int sum) {
        currentDepth++;

        //leaf
        if (node.left == null && node.right == null && maxDepth == currentDepth) {
            return sum + node.val;
        }

        int sideSum = 0;
        if (node.left != null) sideSum += getMaxSum(node.left, maxDepth, currentDepth, sum);
        if (node.right != null) sideSum += getMaxSum(node.right, maxDepth, currentDepth, sum);
        return sideSum;

    }

    private int getMaxDepth(TreeNode node, int currentDepth, int maxDepth) {
        currentDepth++;

        //leaf
        if (node.left == null && node.right == null) {
            return Math.max(maxDepth, currentDepth);
        }

        int max = 0;
        if (node.left != null) max = Math.max(max, getMaxDepth(node.left, currentDepth, maxDepth));
        if (node.right != null) max = Math.max(max, getMaxDepth(node.right, currentDepth, maxDepth));
        return max;
    }
}
