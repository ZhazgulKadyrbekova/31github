import done.RemoveNodesFromLinkedList;

public class Solution {
    public static void main(String[] args) {
        var solution = new RemoveNodesFromLinkedList();

        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(13);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(8);
        node1.next = node2;
        node2.next = (node3);
        node3.next = (node4);
        node4.next = (node5);

        ListNode newNode = solution.removeNodes(node1);

        while (newNode != null) {
            System.out.println(newNode.val);
            newNode = newNode.next;
        }
    }
}
