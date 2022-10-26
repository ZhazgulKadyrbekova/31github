fun main() {
    println(maxScore("110000"))
    println(maxScore("01000"))
    println(maxScore("100111"))
    println(maxScore("1111"))
}

fun maxScore(s: String): Int {
    var ones = 0
    for (i in s) {
        if (i == '1')
            ones++
    }

    var zeros = 0
    val res = mutableListOf<Int>()
    val size = s.length - 2
    for (i in 0..size) {
        if (s[i] == '0') {
            zeros++
        } else {
            ones--
        }
        res.add(zeros + ones)
    }

    return res.sortedByDescending { it }.first()
}