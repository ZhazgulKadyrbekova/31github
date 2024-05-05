import done.DeleteNodeinaLinkedList;

public class Solution {
    public static void main(String[] args) {
        var solution = new DeleteNodeinaLinkedList();

        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        solution.deleteNode(node1);

        while (node1 != null) {
            System.out.println(node1.getVal());
            node1 = node1.getNext();
        }
    }
}
