package done;

import util.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryTreePostorderTraversal {

    //iterative
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<Node> visited = new Stack<>();
        Stack<Node> order = new Stack<>();
        visited.add(root);
        Node current;

        while (!visited.isEmpty()) {
            current = visited.pop();
            order.add(current);

            if (current.children != null) {
                for (Node node : current.children) {
                    visited.add(node);
                }
            }
        }

        while (!order.isEmpty()) {
            res.add(order.pop().val);
        }

        return res;
    }

    //recursive
    public List<Integer> postorder2(Node root) {
        List<Integer> res = new ArrayList<>();

        solve(res, root);

        return res;
    }

    private void solve(List<Integer> res, Node node) {
        if (node == null) return;

        if (node.children != null) {
            for (Node child : node.children) {
                solve(res, child);
            }
        }

        res.add(node.val);
    }
}
