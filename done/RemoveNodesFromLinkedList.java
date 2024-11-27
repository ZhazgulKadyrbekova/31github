package done;

import util.ListNode;

import java.util.Stack;

public class RemoveNodesFromLinkedList {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        while (head != null) {
            if (stack.isEmpty()) {
                stack.push(head.val);
                head = head.next;
                continue;
            }

            int prev = stack.lastElement();
            while (!stack.isEmpty() && prev < head.val) {
                stack.pop();
                prev = stack.isEmpty() ? 0 : stack.lastElement();
            }
            if (prev == 0 || prev >= head.val) {
                stack.push(head.val);
            }
            head = head.next;
        }
//        System.out.println(stack);

        ListNode newNode = null;
        while (!stack.isEmpty()) {
            int val = stack.pop();
            ListNode node = new ListNode(val, newNode);
            newNode = node;
        }

        return newNode;
    }
}
