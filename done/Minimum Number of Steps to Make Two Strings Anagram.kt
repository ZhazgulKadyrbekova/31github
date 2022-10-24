fun main() {
    println(minSteps("bab", "aba"))
}

fun minSteps(s: String, t: String): Int {
    val map1 = s.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount()
    val map2 = t.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount()
    var dif = 0
    for (key in map2.keys) {
        val value = map2[key]!! - map1.getOrDefault(key, 0)
        dif += if (value < 0) 0 else value
    }
    return dif
}
