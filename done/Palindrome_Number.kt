fun main() {
    println(isPalindrome(121))
    println(isPalindrome(-121))
    println(isPalindrome(10))
    println(isPalindrome(0))
}

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    val num = x.toString()
    val size = num.length - 1
    val mid = num.length/2 - 1
    for (i in 0..mid) {
        if (num[i] != num[size-i]) return false
    }
    return true
}
