fun main() {
    println(replaceDigits("a1c1e1"))
//    println(replaceDigits("a1b2c3d4e"))
}

fun replaceDigits(s: String): String {
    val size = s.length-1
    val stringBuilder = StringBuilder()
    var i = 0
    while (i < size) {
        val prev = s[i]
        stringBuilder.append(prev)
        i += 1
        val index = s[i].toInt() - 48
        val shifted = prev.toInt() + index
        stringBuilder.append(shifted.toChar())
        i += 1
    }
    if (size % 2 == 0) stringBuilder.append(s[size])
    return stringBuilder.toString()
}