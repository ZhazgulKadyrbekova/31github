fun main() {
    println(reversePrefix("abcdefd", 'd'))
    println(reversePrefix("xyxzxe", 'z'))
    println(reversePrefix("abcd", 'z'))
}

fun reversePrefix(word: String, ch: Char): String {
    val index = word.indexOf(ch)
    val stringBuilder = StringBuilder()
    stringBuilder.append(word.substring(0,index+1).reversed())
    stringBuilder.append(word.substring(index+1))
    return stringBuilder.toString()
}