fun main() {
//    println(validPalindrome("aba"))
//    println(validPalindrome("abca"))
//    println(validPalindrome("abc"))
//    println(validPalindrome("yd"))
    println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"))
    println(validPalindrome("ebcbbececabbacecbbcbe"))
}

fun validPalindrome(s: String): Boolean {
    val size = s.length
    if (size == 1 || size == 2) return true
    var l = 0
    var r = size - 1
    var flag = false
    while (l <= r) {
//        println("$l\t${s[l]}\t${s[r]}\t$r")
        if (compareChars(s[l], s[r])) {
            l += 1
            r -= 1
        } else {
            if (flag)
                return false
            else {
                if (l+1 >= size) return false
                if (r-1 <= 0) return false
                if (compareChars(s[l+1], s[r])) {
                    l += 2
                    r -= 1
                    flag = true
                }
                else if (compareChars(s[l], s[r-1])) {
                    l += 1
                    r -= 2
                    flag = true
                }
                else return false
            }
        }
    }
    return true
}

fun compareChars(char1: Char, char2: Char): Boolean {
    return char1 == char2
}
