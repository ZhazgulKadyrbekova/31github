package done

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 */


fun getDecimalValue(head: ListNode?): Int {
    var res = 0
    if (head == null) return 0
    val arr = IntArray(30)
    var k = 0
    while (head.next != null) {
        arr[k++] = head.`val`
    }
    for (i in 0..arr.size) {
        res += getPow(2, arr[i])
    }
    return res
}

fun main() {
    val a = ListNode(1)
    val b = ListNode(0)
    val c = ListNode(1)
    a.next = b
    b.next = c


    println(getDecimalValue(a))
}

fun getPow(base: Int, exp: Int): Int {
    var res = 0
    for (i in 0..exp) {
        res += base
    }
    return res
}