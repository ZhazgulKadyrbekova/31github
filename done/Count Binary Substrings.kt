fun main() {
    println(countBinarySubstrings("00110") == 3)
    println(countBinarySubstrings("10101") == 4)
    println(countBinarySubstrings("00110011") == 6)
    println(countBinarySubstrings("10101") == 4)
}

fun countBinarySubstrings(s: String): Int {
    val list = IntArray(s.length)
    list[0] = 1; var k = 0

    for (i in 1 until s.length) {
        if (s[i] != s[i-1]) {
            list[++k] = 1
        } else {
            list[k]++
        }
    }

    var count = 0
    for (i in 0 until k) {
        val min = if (list[i] < list[i+1]) list[i] else list[i+1]
        count += min
    }

    return count
}