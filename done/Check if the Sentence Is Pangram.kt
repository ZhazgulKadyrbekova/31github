fun main() {
    println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"))
}

fun checkIfPangram(sentence: String): Boolean {
    if (sentence.length < 26) return false
    val map = sentence.split("").filter { it.isNotEmpty() }.groupingBy { it }.eachCount()
    println(map)
    return map.keys.size == 26
}