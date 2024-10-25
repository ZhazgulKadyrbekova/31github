import done.SearchinaBinarySearchTree;
import util.TreeNode;

public class Solution {
    public static void main(String[] args) {
        var solution = new SearchinaBinarySearchTree();

        var four = new TreeNode(4, null, null);
        var three = new TreeNode(3, null, null);
        var two = new TreeNode(2, four, null);
        var one = new TreeNode(1, three, two);

        var res = solution.searchBST(one, 3);
        System.out.println(res);
    }
}
