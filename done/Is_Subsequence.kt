fun main() {
//    println(isSubsequence("ace", "abcde"))
//    println(isSubsequence("aec", "abcde"))
//    println(isSubsequence("abc", "ahbgdc"))
//    println(isSubsequence("axc", "ahbgdc"))
    println(isSubsequence("ab", "baab"))
}

fun isSubsequence(s: String, t: String): Boolean {
    var count = 0
    var j: Int
    var k = 0
    for (i in 0..(s.length-1)) {
        j = k
        while (j < t.length) {
            if (s[i] == t[j]) {
//                println("$i\t$j\t$count")
                k = j+1
                count++
                j++
                break
            }
            j++
        }
    }
//    println(count)
    return s.length == count
}