fun main() {
    println(countWords(arrayOf("leetcode","is","amazing","as","is"), arrayOf("amazing","leetcode","is")))
}

fun countWords(words1: Array<String>, words2: Array<String>): Int {
    val oneMap = words1.groupingBy { it }.eachCount().filter { it.value == 1 }
    val twoMap = words2.groupingBy { it }.eachCount().filter { it.value == 1 }
    var count = 0
    for (key in oneMap.keys) {
        if (twoMap.keys.contains(key)) count++
    }
    return count
}
