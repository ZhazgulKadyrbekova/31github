fun main() {
    println(lengthOfLongestSubstring("pwwkew"))
}

fun lengthOfLongestSubstring(s: String): Int {
    var max = 0
    var count = 1
    if (s.length == 0) return 0
    var charArr: MutableList<Char> = mutableListOf(s[0])
    for (i in 1..(s.length-1)) {
        println("$i\t${s[i]}\t$count\t$max")
        if (charArr.contains(s[i])) {
            charArr.remove(s[i])

            if (count > max)
                max = count
            count -= 1
//            charArr = mutableListOf(s[i])
        }
        else {
            charArr.add(s[i])
            count++
//            if (i == s.length - 1) count++
        }
        println("$i\t${s[i]}\t$count\t$max")
        println()
    }
    return if (max > count) max
    else count
}