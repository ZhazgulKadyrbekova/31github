fun main() {
//    println(multiply("123", "456"))
//    println(multiply("9", "9"))
    println(multiply("123456789", "987654321"))
}

fun multiply(num1: String, num2: String): String {
    val iSize = num2.length - 1
    val jSize = num1.length - 1
    var res = 0
    for (i in iSize downTo 0) {
        val sec = num2[i].toInt() - 48
        var temp = 0
        var vume = 0
        for (j in jSize downTo 0) {
//            println("$i\t${num2[i]}\t$j\t${num1[j]}")
            val fir = num1[j].toInt() - 48
            val multiply = fir * sec + vume
            temp += multiply % 10 * getPow(jSize - j)
            vume = multiply / 10
            println("$multiply\t$temp")
        }
        if (vume != 0)
            temp += vume * getPow(jSize + 1)

        res += temp * getPow(iSize - i)
        println("$temp\t$res")
        println()
    }

    return res.toString()
}

fun getPow(power: Int): Int {
    if (power == 0) return 1
    var res = 1
    for (i in 1..power) {
        res *= 10
    }
    return res
}