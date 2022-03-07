fun main() {
    val li1 = ListNode(1)
    val li2 = ListNode(2)
    val li3 = ListNode(2)
    val li4 = ListNode(1)
//    val li5 = ListNode(4)
//    val li6 = ListNode(5)
//    val li7 = ListNode(6)
    li1.next = li2
    li2.next = li3
    li3.next = li4
//    li4.next = li5
//    li5.next = li6
//    li6.next = li7
    printListNode(li1)

    val node = removeElements(li1, 1)
    printListNode(node)
}

fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    var head1 = head
    while (head1?.`val` == `val`)
        head1 = head1.next

    var node = head
    while (node != null) {
        val nextNode = node.next
        if (nextNode?.`val` == `val`) node.next = nextNode.next
        else node = node.next
    }
    return head1
}