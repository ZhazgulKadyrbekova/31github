fun main() {
    println(makeEqual(arrayOf("abc","aabc","bc")))
    println(makeEqual(arrayOf("ab","a")))
    println(makeEqual(arrayOf("a","b")))
    println(makeEqual(arrayOf("caaaaa","aaaaaaaaa","a","bbb","bbbbbbbbb","bbb","cc","cccccccccccc","ccccccc","ccccccc","cc","cccc","c","cccccccc","c")))
}

fun makeEqual(words: Array<String>): Boolean {
    val arr = IntArray(26)
    for (word in words) {
        for (char in word) {
            arr[char-'a']++
        }
    }

    for (i in arr) {
        if (i % words.size != 0) return false
    }
    return true
}