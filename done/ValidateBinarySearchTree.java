package done;

import util.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root.left == null && root.right == null)
            return true;

        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean dfs(TreeNode node, long min, long max) {
        System.out.println("----------------dfs----------------");
        if (node == null) {
            return true;
        }
        System.out.println(node.val);

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return dfs(node.left, min, node.val) &&
                dfs(node.right, node.val, max);
    }
}
