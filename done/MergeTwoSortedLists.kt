fun main() {
    val li1 = ListNode(1)
    val li2 = ListNode(2)
    val li3 = ListNode(4)
    val li4 = ListNode(1)
    val li5 = ListNode(3)
    val li6 = ListNode(4)
    li1.next = li2
    li2.next = li3
    li4.next = li5
    li5.next = li6
    printListNode(li1)
    printListNode(li4)

    val node = mergeTwoLists(li1, li4)
    printListNode(node)
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var node1 = list1
    var node2 = list2

    val head = if (node1 == null && node2 == null) null
    else if (node1 == null) node2
    else if (node2 == null) node1
    else if (node1.`val` < node2.`val`) node1
    else node2
    var prev: ListNode? = null

    while (node1 != null && node2 != null) {
        println("${node1.`val`}\t${node2.`val`}")
        if (node1.`val` < node2.`val`) {
            if (prev != null) prev.next = node1
            prev = node1
            node1 = node1.next
        }
        else {
            if (prev != null) prev.next = node2
            prev = node2
            node2 = node2.next
        }
    }
    if (node1 != null) prev?.next = node1
    else if (node2 != null) prev?.next = node2

    return head
}