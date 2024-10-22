import util.ListNode

fun main() {
    val li1 = ListNode(1)
    val li2 = ListNode(1)
    val li3 = ListNode(1)
    val li4 = ListNode(0)
    val li5 = ListNode(0)
    li1.next = li2
    li2.next = li3
    li3.next = li4
    li4.next = li5
//    li5.next = li2

    println(hasCycle(li1))
}

fun hasCycle(head: ListNode?): Boolean {
    var node = head
    val list = mutableListOf<ListNode>()
    while (node != null) {
        if (list.contains(node)) return true
        list.add(node)
        node = node.next
    }
    return false
}