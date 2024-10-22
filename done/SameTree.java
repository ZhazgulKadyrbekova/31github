package done;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
    //dfs
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    //bfs
    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        Queue<TreeNode> fir = new LinkedList<>();
        Queue<TreeNode> sec = new LinkedList<>();
        fir.add(p);
        sec.add(q);

        while (!fir.isEmpty() && !sec.isEmpty()) {
            TreeNode node1 = fir.poll();
            TreeNode node2 = sec.poll();

            //val
            if (node1.val != node2.val) {
                return false;
            }

            //left
            if (node1.left != null && node2.left != null) {
                fir.add(node1.left);
                sec.add(node2.left);
            }
            else if (node1.left == null && node2.left != null) {
                return false;
            }
            else if (node1.left != null && node2.left == null) {
                return false;
            }

            //right
            if (node1.right != null && node2.right != null) {
                fir.add(node1.right);
                sec.add(node2.right);
            }
            else if (node1.right == null && node2.right != null) {
                return false;
            }
            else if (node1.right != null && node2.right == null) {
                return false;
            }
        }

        return fir.isEmpty() && sec.isEmpty();
    }
}
