package done;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FlattenBinaryTreetoLinkedList {

    public void flatten(TreeNode root) {
        if (root == null) return;

        solve(root);
    }

    private TreeNode solve(TreeNode node) {
        TreeNode leftEndNode = node.left == null ? node : solve(node.left);
        TreeNode rightEndNode = node.right == null ? node : solve(node.right);
        leftEndNode.right = node.right;

        if (node.left != null) {
            node.right = node.left;
        }
        node.left = null;
        return rightEndNode;
    }

    public void flatten2(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();

        solve2(root, queue);

        TreeNode node = root;
        queue.poll();
        while (!queue.isEmpty()) {
            node.left = null;
            node.right = queue.poll();
            node = node.right;
        }
    }
    //T:        O(v)    0ms         100.00%
    //S:        O(n)    42.14MB     40.84%

    private void solve2(TreeNode node, Queue<TreeNode> queue) {
        if (node == null) return;

        queue.add(node);

        solve2(node.left, queue);
        solve2(node.right, queue);
    }

}
