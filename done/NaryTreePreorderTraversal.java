package done;

import util.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryTreePreorderTraversal {

    //iterative
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<Node> stack = new Stack<>();
        stack.add(root);
        Node current;

        while (!stack.isEmpty()) {
            current = stack.pop();
            res.add(current.val);

            int size = current.children == null ? 0 : current.children.size();
            for (int i = size - 1; i >= 0; i--) {
                stack.add(current.children.get(i));
            }

        }

        return res;
    }

    //recursive
    public List<Integer> preorder2(Node root) {
        List<Integer> res = new ArrayList<>();

        solve(res, root);

        return res;
    }

    private void solve(List<Integer> res, Node node) {
        if (node == null) return;

        res.add(node.val);

        if (node.children != null) {
            for (Node child : node.children) {
                solve(res, child);
            }
        }
    }
}
