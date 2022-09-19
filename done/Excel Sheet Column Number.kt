fun main() {
    println(titleToNumber("AB"))
    println(titleToNumber("AAA"))
    println(titleToNumber("ZZ"))
}

fun titleToNumber(columnTitle: String): Int {
    var power = columnTitle.length - 1
    var sum = 0
    for (char in columnTitle) {
        val order = char.toInt() - 64
        sum += order * getPow(power)
        power--
    }
    return sum
}

fun getPow(pow: Int): Int {
    var res = 1
    for (i in 1..pow) {
        res *= 26
    }
    return res
}