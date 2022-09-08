fun main() {
    println(reformatNumber("1-23-45 6"))
    println(reformatNumber("123 4-567"))
    println(reformatNumber("123 4-5678"))
}

fun reformatNumber(number: String): String {
    val text = number.replace("-", "").replace(" ", "")
    val stringBuilder = StringBuilder()
    var size = text.length
    var i = 0
    while (i < text.length) {
        if (size > 4) {
            stringBuilder.append(text.substring(i, i+3)).append('-')
            i += 3
            size -= 3
        }
        else if (size == 3) {
            stringBuilder.append(text.substring(i, i+3))
            i += 3
        }
        else if (size == 2) {
            stringBuilder.append(text.substring(i, i+2))
            i += 2
        }
        else {
            stringBuilder
                .append(text.substring(i, i+2))
                .append('-')
                .append(text.substring(i+2,i+4))
            i += 4
        }
    }
    return stringBuilder.toString()
}