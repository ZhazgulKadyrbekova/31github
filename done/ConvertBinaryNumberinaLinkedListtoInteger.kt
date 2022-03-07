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

    println(getDecimalValue(li1))
}

fun getDecimalValue(head: ListNode?): Int {
    val stringBuilder = StringBuilder()
    var node = head
    while (node != null) {
        stringBuilder.append(node.`val`)
        node = node.next
    }
    val txt = stringBuilder.toString()
    println(txt)
    return binToDec(txt)
}

fun binToDec(text: String): Int {
    val size = text.length - 1
    var sum = 0.0
    for (i in 0..size) {
        val index = Math.abs(i-size)
//        println("$i\t${text[index]}\t$sum")
        val char = text[index]
        if (char == '0') continue
        sum += Math.pow(2.0, i.toDouble())
    }
    return sum.toInt()
}