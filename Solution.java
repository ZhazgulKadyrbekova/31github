import done.DoubleaNumberRepresentedasaLinkedList;
import done.ListNode;

public class Solution {
    public static void main(String[] args) {
        var solution = new DoubleaNumberRepresentedasaLinkedList();

        ListNode node10 = new ListNode(9);
        ListNode node9 = new ListNode(9, node10);
        ListNode node8 = new ListNode(9, node9);
        ListNode node7 = new ListNode(5, node8);
        ListNode node6 = new ListNode(5, node7);
        ListNode node5 = new ListNode(2, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(5, node4);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(3, node2);

        ListNode node = solution.doubleIt(node1);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main2(String[] args) {
        var solution = new JumpGameII();

        System.out.println(solution.jump(new int[] {10,2,5}));
//        System.out.println(solution.jump(new int[] {2,3,1,1,4}));
//        System.out.println(solution.jump(new int[] {3,2,1,0,4}));
//        System.out.println(solution.jump(new int[] {0,3,2,1,4}));
//        System.out.println(solution.jump(new int[] {3,0,0,0,4}));
//        System.out.println(solution.jump(new int[] {2,0,1,0,4}));
//        System.out.println(solution.jump(new int[] {3,0,1,0,4}));
//        System.out.println(solution.jump(new int[] {3,0,0,1,4}));
    }
}
