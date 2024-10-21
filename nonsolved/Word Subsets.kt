package nonsolved

fun main() {
//    val arr = nonsolved.wordSubsets(arrayOf("amazon","apple","facebook","google","leetcode"), arrayOf("e","o"))
    val arr = wordSubsets(arrayOf("amazon","apple","facebook","google","leetcode"), arrayOf("lo","eo"))
    for (i in arr)
        println(i)
}

fun wordSubsets(words1: Array<String>, words2: Array<String>): List<String> {
    val res = mutableListOf<String>()
    for (word in words1) {
        var count = 0
        for (char in words2) {
            if (containsString(word, char))
                count++
            else break
        }
        if (count == words2.size) res.add(word)
    }
    return res
}
fun containsString(word: String, char: String): Boolean {
    val wordMap = word.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount()
    val charMap = char.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount()
    for (entry in charMap.entries) {
        val value = wordMap[entry.key] ?: return false
        if (value - entry.value < 0) return false
    }
    return true
}