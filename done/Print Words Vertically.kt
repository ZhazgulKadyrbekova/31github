fun main() {
//    val arr = printVertically("HOW ARE YOU")
    val arr = printVertically("TO BE OR NOT TO BE")
    for (i in arr)
        println("$i|")
}

fun printVertically(s: String): List<String> {
    val arr = s.split(" ")
    val max = arr.sortedBy { it.length }.last().length
//    println(max)
    val list = mutableListOf<String>()
    for (i in 0 until max) {
        val sb = StringBuilder()
        for (j in arr) {
            if (j.length <= i) sb.append(' ')
            else sb.append(j[i])
        }
        var text = sb.toString()
        while (text.last() == ' ') {
            text = text.removeSuffix(" ")
        }
        list.add(text)
    }
    return list.toList()
}