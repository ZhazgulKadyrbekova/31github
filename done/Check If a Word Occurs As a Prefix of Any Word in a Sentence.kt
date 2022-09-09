fun main() {
    println(isPrefixOfWord("i love eating burger", "burg"))
}

fun isPrefixOfWord(sentence: String, searchWord: String): Int {
    val arr = sentence.split(" ")
    val size = arr.size
    var i = 0
    while (i < size) {
        val word = arr[i]
        if (word.startsWith(searchWord)) return i+1
        i++
    }
    return -1
}