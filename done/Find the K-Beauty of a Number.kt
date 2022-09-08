fun main() {
    println(divisorSubstrings(240, 2))
}

fun divisorSubstrings(num: Int, k: Int): Int {
    var count = 0
    val text = num.toString()
    var i = k
    val size = text.length
    while (i <= size) {
        val value = text.substring(i-k, i).toInt()
        if (value != 0 && num % value == 0) count++
        i++
    }
    return count
}