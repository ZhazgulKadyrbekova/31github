package done;

public class DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        while (node != null) {
            ListNode next = node.getNext();
            if (next == null) {
                return;
            }
            if (next.getNext() == null) {
                node.setNext(null);
            }
            int val = next.getVal();
            node.setVal(val);
            node = node.getNext();
        }
    }
}
