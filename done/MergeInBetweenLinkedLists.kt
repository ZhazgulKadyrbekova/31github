fun main() {
    val li1 = ListNode(0)
    val li2 = ListNode(1)
    val li3 = ListNode(2)
    val li7 = ListNode(8)
//    val li8 = ListNode(9)
    val li4 = ListNode(1000)
    val li5 = ListNode(1000)
    val li6 = ListNode(1000)
    li1.next = li2
    li2.next = li3
    li3.next = li7
//    li7.next = li8
    li4.next = li5
    li5.next = li6

    val node = mergeInBetween(li1, 1, 1, li4)
}

fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
    var beforeA: ListNode? = null
    var afterB: ListNode? = list1

    for (i in 0..(b-1)) {
        if (i == a-1) {
            beforeA = afterB
            println("beforeA:\t${beforeA?.`val`}")
        }
        afterB = afterB?.next
        println("afterB:\t${afterB?.`val`}")
    }

    beforeA?.next = list2
    var node: ListNode? = list2
    while (node?.next != null) {
        node = node.next
        println("afterB:\t${afterB?.`val`}\t\tnode:\t${node?.`val`}")
    }

    node?.next = afterB?.next

    return list1
}