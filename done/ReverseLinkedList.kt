import util.ListNode

fun main() {
    val li1 = ListNode(5)
    val li2 = ListNode(4)
    val li3 = ListNode(3)
    val li4 = ListNode(2)
    val li5 = ListNode(1)
    li1.next = li2
    li2.next = li3
    li3.next = li4
    li4.next = li5

    val node = reverseList(li1)
}
fun reverseList(head: ListNode?): ListNode? {
    var prev = head
    var node = head?.next
    head?.next = null
    var next = node?.next
    while (node != null) {
        next = node.next
        node.next = prev
        prev = node
        node = next
    }
    return prev
}
