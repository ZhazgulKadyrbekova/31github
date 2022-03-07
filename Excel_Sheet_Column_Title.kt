fun main() {
//    println(convertToTitle(1))
    println(convertToTitle(28))
//    println(convertToTitle(701))
}

fun convertToTitle(columnNumber: Int): String {
    val stringBuilder = StringBuilder()
    var num = columnNumber
    while (num > 0) {
        println()
        println("$num\t$stringBuilder")
        val lettersNumber = num % 26
        num /= 26
        stringBuilder.append((lettersNumber + 64).toChar())
    }
    return stringBuilder.toString()
}