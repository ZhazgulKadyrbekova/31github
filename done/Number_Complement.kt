fun main() {
    println(findComplement(5))
    println(findComplement(1))
}

fun findComplement(num: Int): Int {
    val binary = getBinary(num)
    return getDecimal(binary)
}

fun getBinary(num: Int): String {
    val stringBuilder = StringBuilder()
    var n = num
    while (n > 0) {
        stringBuilder.append(n%2)
        n /= 2
    }
    val res = stringBuilder.toString()
    println("getBinary:\t$res")
    return res
}

fun getDecimal(txt: String): Int {
    var count = 0
    val size = txt.length - 1
    for (i in 0..size) {
        if (txt[i] == '0')
            count += Math.pow(2.0, i.toDouble()).toInt()
    }
    println("getDecimal:\t$count")
    return count
}