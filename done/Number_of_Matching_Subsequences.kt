fun main() {
//    val arr: Array<String> = arrayOf("a","bb","acd","ace")
//    println(numMatchingSubseq("abcde", arr))
    val arr: Array<String> = arrayOf("ahjpjau","ja","ahbwzgqnuk","tnmlanowax")
    println(numMatchingSubseq("dsahjpjauf", arr))

}

fun numMatchingSubseq(s: String, words: Array<String>): Int {
    var count = 0
    for (i in words) {
        if (isSubsequence2(i, s)) count++
    }
    return count
}

fun isSubsequence2(s: String, t: String): Boolean {
    var count = 0
    var j: Int
    var k = 0
    for (i in 0..(s.length-1)) {
        j = k
        while (j < t.length) {
            if (s[i] == t[j]) {
                k = j+1
                count++
                j++
                break
            }
            j++
        }
    }
    return s.length == count
}