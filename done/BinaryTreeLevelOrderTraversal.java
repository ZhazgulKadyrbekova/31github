package done;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        solve(res, 0, root);

        return res;
    }

    private void solve(List<List<Integer>> res, int depth, TreeNode node) {
        if (node == null) return;

        if (res.size() <= depth) {
            res.add(new ArrayList<>());
        }

        List<Integer> list = res.get(depth);
        list.add(node.val);
        res.set(depth, list);

        solve(res, depth + 1, node.left);
        solve(res, depth + 1, node.right);

    }
}
