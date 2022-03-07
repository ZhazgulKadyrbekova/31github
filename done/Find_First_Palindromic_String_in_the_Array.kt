fun main() {
    println(firstPalindrome(arrayOf("abc","car","ada","racecar","cool")))
    println(firstPalindrome(arrayOf("notapalindrome","racecar")))
    println(firstPalindrome(arrayOf("def","ghi")))
}

fun firstPalindrome(words: Array<String>): String {
    for (i in words) {
        if (isPalindrome2(i)) return i
    }
    return ""
}

fun isPalindrome2(s: String): Boolean {
    var l = 0
    var r = s.length - 1
    while (l <= r) {
        if (s[l] != s[r]) return false
        l += 1
        r -= 1
    }
    return true
}