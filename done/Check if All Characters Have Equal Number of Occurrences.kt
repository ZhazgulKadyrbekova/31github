fun main() {
    println(areOccurrencesEqual("abacbc"))
    println(areOccurrencesEqual("aaabb"))
}

fun areOccurrencesEqual(s: String): Boolean {
    val map = s.split("").filter { it.isNotEmpty() }.groupingBy { it }.eachCount()
    val counts = map.values.toList()
    for (i in 1 until counts.size) {
        if (counts[i-1] != counts[i]) return false
    }
    return true
}