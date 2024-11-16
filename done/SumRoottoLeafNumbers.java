package done;

import util.TreeNode;

public class SumRoottoLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, 0, 0);
    }

    private int dfs(TreeNode node, int totalSum, int currentSum) {
        currentSum *= 10;
        currentSum += node.val;

        //leaf
        if (node.left == null && node.right == null) {
            return totalSum + currentSum;
        }

        //not leaf
        int sum = 0;
        if (node.left != null) sum += dfs(node.left, totalSum, currentSum);
        if (node.right != null) sum += dfs(node.right, totalSum, currentSum);
        return sum;
    }
}
