fun main() {
    println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"))
    println(validPalindrome("ebcbbececabbacecbbcbe"))
}

fun validPalindrome(s: String): Boolean {
    var l = 0
    var r = s.length - 1
    while (l <= r) {
        if (s[l] != s[r]) return isPalindrome(s, l+1, r) || isPalindrome(s, l, r-1)
        l++
        r--
    }
    return true
}
fun isPalindrome(text: String, l: Int, r: Int): Boolean {
    var left = l
    var right = r
    while (left <= right) {
        if (text[left] != text[right]) return false
        left++
        right--
    }
    return true
}