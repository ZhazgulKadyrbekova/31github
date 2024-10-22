package done;

import util.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    //iterative
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode currentNode;
        Deque<TreeNode> deque = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        if (root == null) return res;

        deque.addFirst(root);

        while (!deque.isEmpty()) {
            currentNode = deque.pop();
            res.add(currentNode.val);

//            System.out.println(currentNode.val);
//            System.out.println(currentNode.right);
//            System.out.println(currentNode.left);

            if (currentNode.right != null)
                deque.addFirst(currentNode.right);
            if (currentNode.left != null)
                deque.addFirst(currentNode.left);

        }

        return res;
    }

    //recursive
    public List<Integer> preorderTraversal2(TreeNode root) {
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
