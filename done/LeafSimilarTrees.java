package done;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        List<Integer> fir = new ArrayList<>();
        List<Integer> sec = new ArrayList<>();

        func(root1, fir);
        func(root2, sec);

        System.out.println(fir);
        System.out.println(sec);
        return fir.equals(sec);
    }

    private void func(TreeNode node, List<Integer> list) {
        if (node.left == null && node.right == null) {
            list.add(node.val);
        }

        if (node.left != null) {
            func(node.left, list);
        }

        if (node.right != null) {
            func(node.right, list);
        }
    }
}
