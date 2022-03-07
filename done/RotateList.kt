fun main() {
    val li1 = ListNode(2)
    val li2 = ListNode(4)
//    val li3 = ListNode(7)
//    val li7 = ListNode(8)
//    val li8 = ListNode(9)
    li1.next = li2
//    li2.next = li3
//    li3.next = li7
//    li7.next = li8
    printListNode(li1)

    val node = rotateRight(li1, 4)
    printListNode(node)
}

fun rotateRight(head: ListNode?, k: Int): ListNode? {
    if (head == null) return null
    if (k == 0) return head
    val list = mutableListOf<ListNode>()
    var size = 0
    var node = head
    while (node != null) {
        list.add(node)
        size++
        node = node.next
    }
    if (size == 1 || k % size == 0) return head
    val k1 = k % size
    val index = size - k1 - 1
//    println("$size\t$index")
    list[index].next = null
    list[size-1].next = head
    return list[index + 1]
}