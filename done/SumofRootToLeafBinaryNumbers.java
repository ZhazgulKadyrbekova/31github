package done;

import util.TreeNode;

public class SumofRootToLeafBinaryNumbers {
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, 0, "");
    }

    private int dfs(TreeNode node, int totalSum, String binary) {
        binary = binary.concat(String.valueOf(node.val));

        //leaf
        if (node.left == null && node.right == null) {
            return totalSum + binToDecimal(binary);
        }

        //not leaf
        int sum = 0;
        if (node.left != null) sum += dfs(node.left, totalSum, binary);
        if (node.right != null) sum += dfs(node.right, totalSum, binary);
        return sum;
    }

    private int binToDecimal(String binary) {
        int pow = 0, res = 0, i = binary.length() - 1;
        while (i >= 0) {
            int num = binary.charAt(i--) - 48;
//            System.out.println(num);
            res += num * Math.pow(2, pow++);
        }
//        System.out.println(res);
//        System.out.println();
        return res;
    }
}
