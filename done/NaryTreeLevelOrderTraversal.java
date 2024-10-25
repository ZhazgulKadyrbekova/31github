package done;

import util.Node;

import java.util.ArrayList;
import java.util.List;

public class NaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();

        solve(res, root, 0);

        return res;
    }

    private void solve(List<List<Integer>> res, Node node, int depth) {
        if (node == null) return;

        if (res.size() <= depth) {
            res.add(new ArrayList<>());
        }

        List<Integer> list = res.get(depth);

        list.add(node.val);
        res.set(depth, list);

        if (node.children != null) {
            for (Node child : node.children) {
                solve(res, child, depth + 1);
            }
        }

    }
}
