fun main() {
    println(reverseStr("abcdefg", 2))
}

fun reverseStr(s: String, k: Int): String {
    val arr = s.toCharArray()
    var i = 0
    val stringBuilder = StringBuilder()
    while (i <= arr.size) {
        val charArray = reverseString(arr, i, i+k)
        stringBuilder.append(charArray)
        i += 2*k
    }
    return stringBuilder.toString()
}

fun reverseString(s: CharArray, start: Int, end: Int): CharArray {
    var temp: Char
    for (i in start..end) {
        temp = s[i]
        s[i] = s[end-i]
        s[end-i] = temp
    }
    return s
}