package done;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        solve(root, res, "");
        return res;
    }

    private void solve(TreeNode node, List<String> list, String path) {
        path += node.val;

        if (node.left == null && node.right == null) {
            list.add(path);
        }

        path += "->";
        if (node.left != null) {
            solve(node.left, list, path);
        }

        if (node.right != null) {
            solve(node.right, list, path);
        }
    }
}
