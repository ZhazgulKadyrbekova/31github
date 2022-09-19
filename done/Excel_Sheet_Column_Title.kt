fun main() {
//    println(convertToTitle(1))
    println(convertToTitle(28))
//    println(convertToTitle(701))
}

fun convertToTitle(columnNumber: Int): String {
    val stringBuilder = StringBuilder()
    var num = columnNumber
    while (num >= 1) {
        val char =  if (num % 26 == 0) { num--; 'Z' }
                    else { (num % 26 + 64).toChar() }
        stringBuilder.insert(0, char)
        num /= 26
    }
    return stringBuilder.toString()
}