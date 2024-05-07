fun main() {
    val li1 = ListNode(2)
    val li2 = ListNode(4)
    val li3 = ListNode(3)
//    val li7 = ListNode(9)
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

    val node = addTwoNumbers1(li1, li4)
}

fun addTwoNumbers1(l1: ListNode?, l2: ListNode?): ListNode? {
    var flag = 0

    var node1 = l1
    var node2 = l2
    var prev1 = l1
    var prev2 = l2

    while (node1 != null && node2 != null) {
        prev1 = node1
        prev2 = node2
        var sum = node1.`val` + node2.`val` + flag
        println("${node1.`val`}\t${node2.`val`}\t$sum\t$flag")
        if (sum >= 10) {
            flag = 1
            sum %= 10
        }
        else flag = 0
        node1.`val` = sum
        node2.`val` = sum
        node1 = node1.next
        node2 = node2.next
    }
//    println("${node1?.`val`}\t${node2?.`val`}\t$flag")
    if (node1 == null && node2 == null) {
//        println("oba null")
        if (flag == 1)
            prev2!!.next = ListNode(1)

        return l2

    }
    else if (node1 == null) {
//        println("node1 null")
        while (flag == 1) {
            if (node2 != null) {
                var sum = node2.`val` + flag
                prev2 = node2
                if (sum >= 10) {
                    flag = 1
                    sum %= 10
                } else flag = 0
                node2.`val` = sum
                node2 = node2.next
            }
            else {
                prev2!!.next = ListNode(1)
                return l2
            }
        }
        return l2
    }
    else {
//        println("node2 null\t${node1.`val`}")
        while (flag == 1) {
            if (node1 != null) {
                var sum = node1.`val` + flag
                prev1 = node1
                if (sum >= 10) {
                    flag = 1
                    sum %= 10
                } else flag = 0
                node1.`val` = sum
                node1 = node1.next
            }
            else {
                prev1!!.next = ListNode(1)
                return l1
            }
        }
        return l1
    }
}