package done;

import java.util.Stack;

public class DoubleaNumberRepresentedasaLinkedList {
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        boolean vume = false;
        ListNode prev = null;
        while (!stack.isEmpty()) {
            int val = stack.pop() * 2;
            if (vume) {
                val++;
                vume = false;
            }
            if (val >= 10) {
                vume = true;
                val %= 10;
            }
            ListNode node = new ListNode(val, prev);
            prev = node;
        }
        if (vume) {
            prev = new ListNode(1, prev);
        }
        return prev;
    }
}
