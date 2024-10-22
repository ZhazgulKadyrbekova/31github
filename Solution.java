import done.BinaryTreeInorderTraversal;
import util.TreeNode;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        var solution = new BinaryTreeInorderTraversal();

        var three = new TreeNode(3, null, null);
        var two = new TreeNode(2, three, null);
        var one = new TreeNode(1, null, two);

        var res = solution.inorderTraversal(one);
        System.out.println(res);
        System.out.println(res.equals(List.of(1,3,2)));
    }
}
