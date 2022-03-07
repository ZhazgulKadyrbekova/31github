fun main() {
    println(repeatedSubstringPattern("abab"))
    println(repeatedSubstringPattern("abaaba"))
    println(repeatedSubstringPattern("abcabcabcabc"))
    println(repeatedSubstringPattern("abcabcabc"))
}

fun repeatedSubstringPattern(s: String): Boolean {
    val half = s.length / 2

    for (i in half downTo 1) {
        val target = s.substring(0, i)
//        println("$target\t$i")
        if (s.length % target.length != 0) continue
        var res = ""

        repeat(s.length / target.length) {
            res += target
        }
//        println("$target\t$res")

        if (res == s) return true
    }
    return false
}
