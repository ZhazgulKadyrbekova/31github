package done;

import util.TreeNode;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        solve(root1, root2);

        return root1;
    }

    private void solve(TreeNode one, TreeNode two) {
        one.val += two.val;

        if (one.left != null && two.left != null) {
            solve(one.left, two.left);
        }
        else if (two.left != null) {
            one.left = two.left;
        }

        if (one.right != null && two.right != null) {
            solve(one.right, two.right);
        }
        else if (two.right != null) {
            one.right = two.right;
        }

    }
}
