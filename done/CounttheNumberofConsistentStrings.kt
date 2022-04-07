fun main() {
    println(countConsistentStrings("ab", arrayOf("ad","bd","aaab","baa","badab")))
    println(countConsistentStrings("abc", arrayOf("a","b","c","ab","ac","bc","abc")))
    println(countConsistentStrings("cad", arrayOf("cc","acd","b","ba","bac","bad","ac","d")))
}

fun countConsistentStrings(allowed: String, words: Array<String>): Int {
    var allowedBytes = 0
    for (i in allowed) {
        val order = i.toInt() - 97
        allowedBytes = allowedBytes or (1 shl order)
    }
    var count = 0
    for (word in words) {
        var flag = true
        for (i in word) {
            val order = i.toInt() - 97
            val number = 1 shl order
            if (hammingWeight(allowedBytes and number) != 1) {
                flag = false
                break
            }
        }
        if (flag) count++
    }
    return count
}

fun countConsistentStrings2(allowed: String, words: Array<String>): Int {
    val allowedChars = allowed.toCharArray()

    var counter = 0
    for (word in words) {
        var flag = true
//        println(word)
        val set = word.toCharArray().toSet()
        for (char in set) {
//            println(char)
            if (!allowedChars.contains(char)){
                flag = false
                break
            }
        }
        if (flag) counter++
//        println("counter:\t$counter")
    }
    return counter
}