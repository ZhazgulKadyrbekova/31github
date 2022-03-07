fun main() {
    println(arrayStringsAreEqual(arrayOf("abc", "d", "defg"), arrayOf("abcddefg")))
}

fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
    val builder1 = StringBuilder()
    val builder2 = StringBuilder()
    var min =   if (word1.size < word2.size) word1.size
                else word2.size
    min--
    for (i in 0..min) {
        builder1.append(word1[i])
        builder2.append(word2[i])
    }
    min++
    if (word1.size > word2.size) {
        for (i in min..(word1.size-1))
            builder1.append(word1[i])
    }
    else if (word1.size < word2.size) {
        for (i in min..(word2.size-1))
            builder2.append(word2[i])
    }

    return builder1.toString() == builder2.toString()
}