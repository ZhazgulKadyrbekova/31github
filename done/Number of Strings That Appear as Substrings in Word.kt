fun main() {
    val arr = arrayOf("a","b","c")
    println(numOfStrings(arr, "aaaaabbbbb"))
}

fun numOfStrings(patterns: Array<String>, word: String): Int {
    var count = 0
    for (i in patterns) {
        if (word.contains(i)) count++
    }
    return count
}