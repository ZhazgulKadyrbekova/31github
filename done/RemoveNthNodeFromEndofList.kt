fun main() {
    var node1 = ListNode(1)
    val node2 = ListNode(2)
//    val node3 = ListNode(3)
//    val node4 = ListNode(4)
//    val node5 = ListNode(5)
    node1.next = node2
//    node2.next = node3
//    node3.next = node4
//    node4.next = node5

    node1 = removeNthFromEnd(node1, 1)!!
}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    if (head == null) return null
    var size = 0
    var node = head
    while (node != null) {
        size++
        node = node.next
    }

    if (n == size) return head.next

    var counter = 0
    node = head
    var prev: ListNode = node
    while (node != null) {
        if (counter == size - n - 1)
            prev = node
        if (counter == size - n)
            prev.next = node.next
        println("${node.`val`}\t$counter\t${prev.`val`}")
        counter++
        node = node.next
    }
    return head
}