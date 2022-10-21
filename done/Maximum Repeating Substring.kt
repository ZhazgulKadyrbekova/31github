fun main() {
//    println(maxRepeating("ababc", "ab"))
    println(maxRepeating("a", "aa"))
}

fun maxRepeating(sequence: String, word: String): Int {
    var minSize = word.length; val maxSize = sequence.length
    var res = 0; var temp = word
    while (minSize <= maxSize) {
        if (sequence.contains(temp)) {
            res++
            temp = "$temp$word"
            minSize = temp.length
        } else return res
    }

    return res
}