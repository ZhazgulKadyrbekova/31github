import util.ListNode

fun main() {
    val li1 = ListNode(2)
//    val li2 = util.ListNode(4)
//    val li3 = util.ListNode(7)
//    val li7 = util.ListNode(8)
//    val li8 = util.ListNode(9)
//    li1.next = li2
//    li2.next = li3
//    li3.next = li7
//    li7.next = li8

    deleteMiddle(li1)
}

fun deleteMiddle(head: ListNode?): ListNode? {
    var node = head
    var half = node
    var beforeHalf = node
    var counter = 0
    while (node != null && node.next != null) {
        println("${node.`val`}\t${half?.`val`}")
        if (counter % 2 == 0) {
            beforeHalf = half
            half = half?.next
        }
        node = node.next
        counter++
//        println("${node?.`val`}\t${half?.`val`}")
//        println()
    }
    println("counter: $counter")
    println("${node?.`val`}\t${half?.`val`}")
    beforeHalf?.next = half?.next
//    half?.next = half?.next?.next
    return if (counter == 0) null else head
}