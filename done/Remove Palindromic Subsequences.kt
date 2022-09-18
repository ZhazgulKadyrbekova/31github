fun main() {
    println(removePalindromeSub("ab"))
}

fun removePalindromeSub(s: String): Int {
    return if (isPalindrome1(s)) 1
    else 2
}

fun isPalindrome1(text: String): Boolean {
    val size = text.length - 1
    var i = 0
    while (i <= size) {
        if (!(text[i] == text[size - i])) return false
        i++
    }
    return true
}