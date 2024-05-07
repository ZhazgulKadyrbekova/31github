fun main() {
    val li1 = ListNode(2)
    val li2 = ListNode(4)
    val li3 = ListNode(3)
    val li7 = ListNode(9)
    val li8 = ListNode(9)
    li1.next = li2
    li2.next = li3
    li3.next = li7
    li7.next = li8

    val node = swapNodes(li1, 2)
}

fun swapNodes(head: ListNode?, k: Int): ListNode? {
    val list = mutableListOf<Int>()
    var node = head
    while (node != null) {
        list.add(node.`val`)
        node = node.next
    }

    val size = list.size
    val temp = list[k-1]
    list[k-1] = list[size-k]
    list[size-k] = temp

    val head1 = ListNode(list[0])
    node = head1
    var prev = node
    for (i in 1 until size) {
        node = ListNode(list[i])
        prev?.next = node
        prev = node
    }
    return head1
}