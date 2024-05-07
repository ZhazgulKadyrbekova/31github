import java.util.*

fun main() {
//    val li1 = ListNode(2)
//    val li2 = ListNode(4)
    val li3 = ListNode(7)
    val li7 = ListNode(8)
    val li8 = ListNode(9)
    val li4 = ListNode(5)
    val li5 = ListNode(6)
    val li6 = ListNode(4)
//    li1.next = li2
//    li2.next = li3
    li3.next = li7
    li7.next = li8
    li4.next = li5
    li5.next = li6

    val node = addTwoNumbers(li3, li4)
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val st1: Stack<Int> = Stack()
    val st2: Stack<Int> = Stack()

    var node = l1
    while (node != null) {
        st1.push(node.`val`)
        node = node.next
    }
//    println("st1:\t$st1")

    node = l2
    while (node != null) {
        st2.push(node.`val`)
        node = node.next
    }
//    println("st2:\t$st2")
//    println()

    var vume = 9
    var prevNode: ListNode? = null
    while (st1.isNotEmpty() || st2.isNotEmpty()) {
//        println("st1:\t$st1")
//        println("st2:\t$st2")
        var temp = if (vume == 1) 1 else 0
        if (st1.isNotEmpty()) temp += st1.pop()
        if (st2.isNotEmpty()) temp += st2.pop()

//        println("$vume\t$temp")
        node = ListNode(temp % 10)
        if (vume != 9) {
            node.next = prevNode
//            prevNode?.next = node
        }
        vume = temp / 10
        prevNode = node
    }
    return if (vume == 1) {
        node = ListNode(1)
        node.next = prevNode
        node
    }
    else
        prevNode
}