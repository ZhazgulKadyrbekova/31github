fun main() {
    println(longestPalindrome("abccccdd"))
    println(longestPalindrome("a"))
    println(longestPalindrome("bb"))
}

fun longestPalindrome(s: String): Int {
    val charArr = s.toCharArray()
    val map = hashMapOf<Char, Int>()
    for (i in charArr) {
        val value = map[i]
        if (value == null)
            map[i] = 1
        else
            map[i] = value + 1
    }
//    println(map)
    var hasOdd = false
    var count = 0
    for (i in map.values) {
        if (i % 2 == 1) {
            hasOdd = true
            count += (i - 1)
        }
        else {
            count += i
        }
    }
    if (hasOdd) count += 1
    return count
}