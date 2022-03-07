fun main() {
    val li1 = ListNode(2)
    val li2 = ListNode(4)
    val li3 = ListNode(3)
    val li7 = ListNode(8)
    val li8 = ListNode(9)
    li1.next = li2
    li2.next = li3
    li3.next = li7
    li7.next = li8
    printListNode(li1)

    val node = swapPairs(li1)
    printListNode(node)
}

fun swapPairs(head: ListNode?): ListNode? {
    var node = head
    var next = head?.next
    while (node != null && next != null) {
        val temp = node.`val`
        node.`val` = next.`val`
        next.`val` = temp
        node = next.next
        next = node?.next
    }
    return head
}