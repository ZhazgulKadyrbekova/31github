fun main() {
    println(findLongestWord("abpcplea", listOf("ale","applb","apple","monkey","plea")))
}

fun findLongestWord(s: String, dictionary: List<String>): String {
    var res = mutableListOf<String>()
    var max = 0

    for (word in dictionary) {
        if (isRight(s, word)) {
            res.add(word)
            if (word.length > max) max = word.length
        }
    }

    return if (res.isEmpty()) ""
    else {
        res.sortBy { it }
        println(res)
        res.first { it.length == max }
    }
}
fun isRight(long: String, short: String): Boolean {
    var i = 0; var j = 0
    while (j < short.length && i < long.length) {
        if (long[i] == short[j]) {
            i++; j++;
        } else {
            i++;
        }
    }
    return j == short.length
}
