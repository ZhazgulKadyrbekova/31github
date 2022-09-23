fun main() {
    println(shortestCompletingWord("1s3 PSt", arrayOf("step","steps","stripe","stepple")))
}

fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
    val freqMap = HashMap<Char, Int>()
    for (i in licensePlate.toLowerCase()) {
        if (i.isLetter()) {
            freqMap[i] = freqMap[i]?.plus(1) ?: 1
        }
    }

    var res = "111111111111111"
    for (word in words) {
        val tempMap = HashMap(freqMap)
        for (i in word) {
            if (tempMap.keys.contains(i)) {
                tempMap[i] = tempMap[i]!! - 1
            }
        }

        if (tempMap.values.none { it > 0 } && word.length < res.length) {
            res = word
        }

    }
    return res
}
