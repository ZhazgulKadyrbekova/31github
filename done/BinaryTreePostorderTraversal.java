package done;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {

    //iterative
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> visited = new Stack<>();
        Stack<TreeNode> order = new Stack<>();
        visited.add(root);
        TreeNode current;

        while (!visited.isEmpty()) {
            current = visited.pop();
            order.add(current);

            if (current.left != null)
                visited.add(current.left);
            if (current.right != null)
                visited.add(current.right);
        }

        while (!order.isEmpty()) {
            res.add(order.pop().val);
        }

        return res;
    }

    //recursive
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        dfs(res, root);
        return res;
    }

    public void dfs(List<Integer> res, TreeNode node) {
        if (node == null) return;

        dfs(res, node.left);
        dfs(res, node.right);

        res.add(node.val);
    }
}
