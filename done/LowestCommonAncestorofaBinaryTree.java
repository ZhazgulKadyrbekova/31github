package done;

import util.TreeNode;

public class LowestCommonAncestorofaBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        return solve(root, p, q);
    }

    private TreeNode solve(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) return null;

        boolean cur = (node == p || node == q);
        boolean left = hasValues(node.left, p, q);
        boolean right = hasValues(node.right, p, q);

        if ((left && right) || (cur && (left || right))) {
            return node;
        }

        if (left) {
            return solve(node.left, p, q);
        }
        else if (right) {
            return solve(node.right, p, q);
        }
        return null;
    }

    private boolean hasValues(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return false;
        }

        if (node == p || node == q) {
            return true;
        }

        return hasValues(node.left,p,q) || hasValues(node.right,p,q);
    }

    //TLE
    private TreeNode lca(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) return null;

        if (node == p || node == q) return node;

        TreeNode leftLCA = lca(node.left, p, q);
        TreeNode rightLCA = lca(node.right, p, q);

        if (leftLCA != null && rightLCA != null) {
            return node;
        }
        else if (leftLCA != null) {
            return lca(node.left, p, q);
        }
        else {
            return lca(node.right, p, q);
        }
    }
}