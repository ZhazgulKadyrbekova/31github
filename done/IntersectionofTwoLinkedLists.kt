fun main() {
    val li1 = ListNode(2)
    val li2 = ListNode(2)
    val li3 = ListNode(4)
    val li4 = ListNode(5)
    val li5 = ListNode(4)
    val li6 = ListNode(2)
    val li7 = ListNode(2)
    li1.next = li2
    li2.next = li3
    li3.next = li4
    li4.next = li5
    li6.next = li7
    li7.next = li3

    printListNode(li1)
    printListNode(li6)
    println(getIntersectionNode(li1,li6))
}

fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
    var nodeA = headA
    var nodeB = headB
    val list = mutableListOf<ListNode>()
    while (nodeA != null || nodeB != null) {
        if (list.contains(nodeA)) return nodeA
        nodeA?.let {
            list.add(it)
        }

        if (list.contains(nodeB)) return nodeB
        nodeB?.let {
            list.add(it)
        }
        nodeA = nodeA?.next
        nodeB = nodeB?.next
    }
    return null
}