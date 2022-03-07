fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
    println(isPalindrome("race a car"))
    println(isPalindrome(" "))
}

fun isPalindrome(s: String): Boolean {
    val size = s.length
    var l = 0
    var r = size - 1
    while (l <= r) {
        if (!isAlphanumeric(s[l])) {
            l += 1
            continue
        }
        if (!isAlphanumeric(s[r])) {
            r -= 1
            continue
        }
        if (!func(s[l], s[r])) return false
        l += 1
        r -= 1
    }
    return true
}

fun func(char1: Char, char2: Char): Boolean {
    return char1.toLowerCase() == char2.toLowerCase()
}

fun isAlphanumeric(char: Char): Boolean {
    val num = char.toInt()
    if (num in (65..90)) return true
    if (num in (97..122)) return true
    if (num in (48..57)) return true
    return false
}