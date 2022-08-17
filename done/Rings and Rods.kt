fun main() {
    println(countPoints("B0B6G0R6R0R6G9"))
}

fun countPoints(rings: String): Int {
    var i = 0
    val size = rings.length - 1
    val map = HashMap<Char, String>()
    while (i <= size) {
        val char = rings[i]
        val key = rings[i+1]
        val value = map[key]
        i+=2
        if (value == null) {
            map[key] = char.toString()
        }
        else if (value.contains(char)) {
            continue
        }
        else {
            map[key] = value + char.toString()
        }

    }
    return map.values.count { it.length == 3 }
}