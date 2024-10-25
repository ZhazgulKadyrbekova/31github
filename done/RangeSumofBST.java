package done;

import util.TreeNode;

public class RangeSumofBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return solve(root, low, high, 0);
    }

    private int solve(TreeNode root, int low, int high, int sum) {
//        System.out.println("-----------------solve-----------------");
        if (root == null) return sum;

        int current = root.val;
        if (current >= low && current <= high) {
            sum += current;
        }
//        System.out.println(current + "\t" + sum);

        if (current >= low) {
            sum = solve(root.left, low, high, sum);
        }

        if (current <= high) {
            sum = solve(root.right, low, high, sum);
        }

        return sum;
    }
}
