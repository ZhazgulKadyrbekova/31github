fun main() {
    println(sortSentence("is2 sentence4 This1 a3"))
}

fun sortSentence(s: String): String {
    val arr = s.split(' ')
    val res = Array(arr.size) { "" }
    for (i in arr) {
        val lastIndex = i.lastIndex
        val lastChar = i[lastIndex].toInt() - 48
        res[lastChar - 1] = i.substring(0, lastIndex)
    }
    return res.joinToString(" ")
}