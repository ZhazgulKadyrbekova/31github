package done;

import util.TreeNode;

public class CountGoodNodesinBinaryTree {
    public int goodNodes(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 1;
        }

        return calculateAmountOfGoodNodes(root, Integer.MIN_VALUE);
    }

    private int calculateAmountOfGoodNodes(TreeNode node, int max) {
        int count = 0;
        if (node.val >= max) {
            count += 1;
            max = node.val;
        }

        if (node.left != null) {
            count += calculateAmountOfGoodNodes(node.left, max);
        }
        if (node.right != null) {
            count += calculateAmountOfGoodNodes(node.right, max);
        }

        return count;
    }
}
