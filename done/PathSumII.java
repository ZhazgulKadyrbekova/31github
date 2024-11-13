package done;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        solve(res, new ArrayList<>(), root, targetSum);
        return res;
    }

    private void solve(List<List<Integer>> res, List<Integer> currentPath, TreeNode node, int remainingSum) {
        if (node == null) return;

        currentPath.add(node.val);

        if (node.right == null && node.left == null && remainingSum == node.val) {
            res.add(new ArrayList<>(currentPath));
        } else {
            solve(res, currentPath, node.left, remainingSum - node.val);
            solve(res, currentPath, node.right, remainingSum - node.val);
        }

        currentPath.remove(currentPath.size() - 1);
    }
    //T:    O(n)        1ms         100.00%
    //S:    O(L*h)      44.73MB     26.15%
}
