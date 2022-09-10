fun main() {
    println(maxNumberOfBalloons("balon"))
}

fun maxNumberOfBalloons(text: String): Int {
    val map = text
        .split("")
        .filter { it.isNotBlank() }
        .groupingBy { it }
        .eachCount()
    val balloon = "balloon"
    var count = 10000
    for (i in balloon) {
        val char = i.toString()
        if (map.keys.contains(char)) {
            var value = map[char]!!
            if (char == "l" || char == "o") value /= 2
            if (value < count) count = value
        }
        else return 0
    }
    return count
}