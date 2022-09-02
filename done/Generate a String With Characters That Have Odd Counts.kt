fun main() {
    println(generateTheString(3))
    println(generateTheString(4))
//    println(generateTheString(500))
}

fun generateTheString(n: Int): String {
    if (n % 2 == 0) {
        val stringBuilder = StringBuilder()
        for (i in 0..(n-2)) {
            stringBuilder.append('a')
        }
        stringBuilder.append('b')
        return stringBuilder.toString()
    }

    val stringBuilder = StringBuilder()
    for (i in 0..(n-1)) {
        stringBuilder.append('a')
    }
    return stringBuilder.toString()
}