fun main() {
    println(destCity(listOf(listOf("London","New York"), listOf("New York","Lima"), listOf("Lima","Sao Paulo"))))
}

fun destCity(paths: List<List<String>>): String {
    val counts = hashMapOf<String, Int>()
    val rows = hashMapOf<String, Int>()
    for (path in paths) {
        for ((index, value) in path.withIndex()) {
            rows[value] = rows.getOrDefault(value, index)
            counts[value] = counts.getOrDefault(value, 0) + 1
        }
    }
    val firstRow = rows.entries.filter { it.value == 0 }.map { it.key }
    println(counts)
    println(rows)
    println(firstRow)
    return counts.entries.filter { it.value == 1 && !firstRow.contains(it.key) }.map { it.key }.first()

}