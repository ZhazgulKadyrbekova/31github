import util.ListNode

fun main() {
    val li1 = ListNode(2)
    val li2 = ListNode(4)
    val li3 = ListNode(3)
    val li7 = ListNode(4)
    val li8 = ListNode(2)
    li1.next = li2
    li2.next = li3
    li3.next = li7
    li7.next = li8
    println(isPalindrome(li1))

}

fun isPalindrome(head: ListNode?): Boolean {
    val stringBuilder = StringBuilder()
    var node = head
    while (node != null) {
        stringBuilder.append(node.`val`)
        node = node.next
    }

    val txt = stringBuilder.toString()
    val index = txt.length - 1
    val half = index/2
    for (i in 0..half) {
        if (txt[i] != txt[index-i]) return false
    }
    return true
}