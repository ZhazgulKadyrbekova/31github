package done;

import util.TreeNode;

import java.util.*;

public class BinaryTreeInorderTraversal {

    //iterative
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;

        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.add(currentNode);
                currentNode =  currentNode.left;
            }

            currentNode = stack.pop();
            res.add(currentNode.val);

            currentNode = currentNode.right;
        }

        return res;
    }

    //recursive
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        solve(res, root);

        return res;
    }

    private void solve(List<Integer> res, TreeNode node) {
        if (node == null) return;

        solve(res, node.left);
        res.add(node.val);
        solve(res, node.right);
    }
}
