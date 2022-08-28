fun main() {
    println(countPrefixes(arrayOf("a","b","c","ab","bc","abc"), "abc"))
}

fun countPrefixes(words: Array<String>, s: String): Int {
    var count = 0
    for (i in words) {
        if (s.startsWith(i)) count++
    }
    return count
}