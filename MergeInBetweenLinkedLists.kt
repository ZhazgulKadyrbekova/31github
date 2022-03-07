fun main() {
    val li1 = ListNode(2)
    val li2 = ListNode(4)
    val li3 = ListNode(3)
//    val li7 = ListNode(8)
//    val li8 = ListNode(9)
    val li4 = ListNode(5)
    val li5 = ListNode(6)
    val li6 = ListNode(4)
    li1.next = li2
    li2.next = li3
//    li3.next = li7
//    li7.next = li8
    li4.next = li5
    li5.next = li6
    printListNode(li1)
    printListNode(li4)

    val node = mergeInBetween(li1, 1, 1, li4)
    printListNode(node)
}

fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
    var counter = 1
    var node = list1
    var beforeA: ListNode? = null
    var afterB: ListNode? = null
    var prevNode: ListNode? = null

    println("node\tprevNode\tbeforeA\tafterB")
    while (node != null) {
        println("${node.`val`}\t${prevNode?.`val`}\t${beforeA?.`val`}\t${afterB?.`val`}")
        prevNode = node
        node = node.next
        if (counter == a) {
            beforeA?.next = list2
        }
        if (counter == b) {
            afterB = node?.next
//            println("afterB is ${afterB?.`val`}")
//            println("node is ${node?.`val`}")
            node = list2?.next
//            break
        }
        counter++
        beforeA = node

    }
    prevNode?.next = afterB
    return if (a == 0) return list2
    else list1
}