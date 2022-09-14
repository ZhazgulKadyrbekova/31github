fun main() {
    println(maxLengthBetweenEqualCharacters("abca"))
}

fun maxLengthBetweenEqualCharacters(s: String): Int {
    val map: Map<String,Int> = s
        .split("")
        .filter { it.isNotBlank() }
        .groupingBy { it }
        .eachCount()
        .filter { it.value > 1 }
    if (map.isEmpty()) return -1
    var max = 0
    for (i in map.keys) {
        val count = s.lastIndexOf(i) - s.indexOf(i) - 1
        if (max < count) max = count
    }
    return max
}