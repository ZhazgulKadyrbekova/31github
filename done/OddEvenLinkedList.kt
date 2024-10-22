import util.ListNode

fun main() {
    val li1 = ListNode(2)
    val li2 = ListNode(4)
    val li3 = ListNode(7)
    val li7 = ListNode(8)
    val li8 = ListNode(9)
    li1.next = li2
    li2.next = li3
    li3.next = li7
    li7.next = li8

    val node = oddEvenList(li1)
}
fun oddEvenList(head: ListNode?): ListNode? {
    var node = head

    var head1: ListNode? = null
    var head2: ListNode? = null
    var prev1: ListNode? = null
    var prev2: ListNode? = null
    var counter = 0
    while (node != null) {
//        println("$counter\t${node.`val`}")
        if (counter % 2 == 0) {
            if (prev1 == null) {
                head1 = node
            } else {
                prev1.next = node
            }
            prev1 = node
        } else {
            if (prev2 == null) {
                head2 = node
            } else {
                prev2.next = node
            }
            prev2 = node
        }
        node = node.next
        counter++
//        println("$counter\t${node?.`val`}")
//        println()
    }
    prev1?.next = head2
    prev2?.next = null
    return head1
}