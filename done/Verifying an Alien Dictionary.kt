fun main() {
    println(isAlienSorted(arrayOf("word","world","row"), "worldabcefghijkmnpqstuvxyz"))
}

fun isAlienSorted(words: Array<String>, order: String): Boolean {
    var i = 1; var prev = words[0]
    while (i < words.size) {
        if (!isFirstLess(prev, words[i], order)) return false
        prev = words[i]
        i++
    }
    return true
}

fun isFirstLess(w1: String, w2: String, order: String): Boolean {
    var i = 0
    while (i <= w1.length && i <= w2.length) {
        val index1 = if (w1.length == i) -1 else order.indexOf(w1[i])
        val index2 = if (w2.length == i) -1 else order.indexOf(w2[i])
        if (index1 > index2) return false
        else if (index1 < index2) return true
        i++
    }
    return true
}