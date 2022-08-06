fun main() {
    println(mergeAlternately("abc", "pqr"))
}

fun mergeAlternately(word1: String, word2: String): String {
    val stringBuilder = StringBuilder()
    val size = if (word1.length > word2.length) word1.length else word2.length
    var i = 0
    while (i <= size) {
        if (word1.length > i) {
            stringBuilder.append(word1[i])
        }
        if (word2.length > i) {
            stringBuilder.append(word2[i])
        }
        i++
    }
    return stringBuilder.toString()
}