public class InsertGreatestCommonDivisorsinLinkedList {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while (cur.getNext() != null) {
            ListNode next = cur.getNext();

            int a = cur.getVal();
            int b = next.getVal();
            int gcd = getGCD(a, b);
            ListNode listNode = new ListNode(gcd);

            cur.setNext(listNode);
            listNode.setNext(next);

            cur = cur.getNext().getNext();
        }
        return head;
    }

    private int getGCD(int a, int b) {
        if (a < b)
            return getGCD(b, a);
        if (b == 0)
            return a;
        return getGCD(b, a % b);
    }
}
