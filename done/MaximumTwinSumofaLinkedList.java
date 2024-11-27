package done;

import util.ListNode;

public class MaximumTwinSumofaLinkedList {
    public int pairSum(ListNode head) {
        int size = getSize(head);
        int half = size / 2;
        int[] arr = new int[half];
        int max = 0;
        int i = 0;
        while (head != null) {
//            System.out.println(head.val);
            if (i < half) {
                arr[i] = head.val;
            }
            else {
                max = Math.max(arr[size - 1 - i] + head.val, max);
            }
            i++;
            head = head.next;
        }
        return max;
    }

    private int getSize(ListNode node) {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }
}
