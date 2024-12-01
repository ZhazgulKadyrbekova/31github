package done;

import util.TreeNode;

public class LongestZigZagPathinaBinaryTree {
    private int max = 0;
    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return max;
        }

        solve(root.left, true, 1);
        solve(root.right, false, 1);

        return max;
    }

    private void solve(TreeNode node, boolean left, int count) {
        if (node == null) return;

        if (count > max) {
            max = count;
        }

        count++;

        if (left) {
            solve(node.right, false, count);
            solve(node.left, true, 1);
        }
        else {
            solve(node.left, true, count);
            solve(node.right, false, 1);
        }
    }
}
