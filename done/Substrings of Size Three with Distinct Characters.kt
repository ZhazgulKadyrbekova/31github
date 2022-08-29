fun main() {
//    println(countGoodSubstrings("leetcode"))
//    println(countGoodSubstrings("xyzzaz"))
    println(countGoodSubstrings("xyzzat"))
}

fun countGoodSubstrings(s: String): Int {
    val size = s.length
    var count = 0
    var l = 0
    var r = 3
    while (r <= size) {
        println(s.substring(l, r))
        println(s.substring(l, r).groupingBy { it }.eachCount())
        val keys = s.substring(l, r).groupingBy { it }.eachCount().keys
        if (keys.size == 3) count++
        l++; r++
    }
    return count
}