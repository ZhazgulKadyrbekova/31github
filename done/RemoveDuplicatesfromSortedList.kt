fun main() {
    val li1 = ListNode(1)
    val li2 = ListNode(1)
    val li3 = ListNode(1)
    val li4 = ListNode(3)
    val li5 = ListNode(3)
    li1.next = li2
    li2.next = li3
    li3.next = li4
    li4.next = li5
    printListNode(li1)

    deleteDuplicates(li1)
    printListNode(li1)
}

fun deleteDuplicates(head: ListNode?): ListNode? {
    var currentNode = head
    var nextNode = currentNode?.next
    while (currentNode != null) {
        val currentVal = currentNode.`val`
        val nextVal = nextNode?.`val`
//        println("$currentNode\t$currentVal\t$nextNode\t$nextVal")
        if (currentVal == nextVal)
            currentNode.next = nextNode?.next
        else
            currentNode = nextNode

        nextNode = currentNode?.next
    }
    return head
}