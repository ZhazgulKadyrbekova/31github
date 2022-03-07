class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun printListNode(head: ListNode?) {
    var node = head
    while (node != null) {
        print("${node.`val`}\t")
        node = node.next
    }
    println()
}