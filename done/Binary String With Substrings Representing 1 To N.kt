fun main() {
    println(queryString("110101011011000011011111000000", 15))
}

fun queryString(s: String, n: Int): Boolean {
    var i = 0
    while (i <= n) {
        if (s.contains(decimalToBinary(i)))
            i++
        else return false
    }
    return true
}
fun decimalToBinary(n: Int): String {
    var nmb = n
    val sb = StringBuilder()
    while (nmb > 0) {
        val a = nmb % 2
        sb.insert(0, a)
        nmb /= 2
    }
//    println(sb)
    return sb.toString()
}