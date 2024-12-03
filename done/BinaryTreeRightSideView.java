package done;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return List.of();

        List<Integer> list = new ArrayList<>();
        solve(root, 0, list);
        System.out.println(list);
        return list;
    }

    private void solve(TreeNode node, int index, List<Integer> list) {
        if (node == null) return;

        if (list.size() <= index) {
            list.add(node.val);
        }

        solve(node.right, index + 1, list);
        solve(node.left, index + 1, list);
    }
}
