fun main() {
    println(lengthOfLongestSubstring("pwwkew"))
    println(lengthOfLongestSubstring("abcabcbb"))
    println(lengthOfLongestSubstring("bbbbbb"))
    println(lengthOfLongestSubstring("cbaab"))
}

fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) return 0
    var max = 0
    var i = 0
    var j = 0
    val set = hashSetOf<Char>()
    while (j < s.length) {
        println(set)
        if (!set.contains(s[j])) {
            set.add(s[j++])
            max = Math.max(max, set.size)
        }
        else {
            set.remove(s[i++])
        }
        println(set)
        println()
    }
    return max
}
