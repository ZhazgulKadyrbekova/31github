package done;

import util.ListNode;

public class DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        while (node != null) {
            ListNode next = node.next;
            if (next == null) {
                return;
            }
            if (next.next == null) {
                node.next = null;
            }
            int val = next.val;
            node.val = (val);
            node = node.next;
        }
    }
}
