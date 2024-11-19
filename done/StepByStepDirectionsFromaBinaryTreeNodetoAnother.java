package done;

import util.TreeNode;

public class StepByStepDirectionsFromaBinaryTreeNodetoAnother {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        //find lca
        TreeNode lca = getLCA(root, startValue, destValue);

        StringBuilder startPath = new StringBuilder();
        StringBuilder destPath = new StringBuilder();

        getPath(lca, startValue, startPath);
        getPath(lca, destValue, destPath);

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < startPath.length(); i++) {
            res.append('U');
        }

        res.append(destPath);

        return res.toString();
    }

    private boolean getPath(TreeNode node, int value, StringBuilder builder) {
        if (node == null) {
            return false;
        }

        if (node.val == value) {
            return true;
        }


        builder.append('L');
        if (getPath(node.left, value, builder)) {
            return true;
        }
        builder.deleteCharAt(builder.length() - 1);


        builder.append('R');
        if (getPath(node.right, value, builder)) {
            return true;
        }
        builder.deleteCharAt(builder.length() - 1);


        return false;
    }

    private TreeNode getLCA(TreeNode node, int a, int b) {
        if (node == null || node.val == a || node.val == b) {
            return node;
        }

        TreeNode left = getLCA(node.left, a, b);
        TreeNode right = getLCA(node.right, a, b);

        if (left != null && right != null) {
            return node;
        }

        return left == null ? right : left;
    }

}
