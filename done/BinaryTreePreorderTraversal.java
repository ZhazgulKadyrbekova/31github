package done;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        solve(res, root);

        return res;
    }

    public void solve(List<Integer> res, TreeNode node) {
        if (node == null) {
            return;
        }

        res.add(node.val);

        solve(res, node.left);
        solve(res, node.right);
    }
}
