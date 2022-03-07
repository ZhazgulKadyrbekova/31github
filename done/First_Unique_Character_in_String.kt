fun main() {
//    println(firstUniqChar("leetcode"))
//    println(firstUniqChar("loveleetcode"))
//    println(firstUniqChar("aabb"))
    println(firstUniqChar("aadadaad"))
}

fun firstUniqChar(s: String): Int {
    val size = s.length - 1
    var charArray = s.toCharArray()
    for (i in 0..size) {
        if (charArray[i] == '0') continue
//        println("aaa\t$i\t${charArray[i]}")
//        val index = includes(charArray[i], charArray, i+1, size)
        charArray = includes(charArray[i], charArray, i+1, size)
        if (charArray.isEmpty()) return i
        else {
            charArray[i] = '0'
        }
    }
    return -1
}


fun includes(char: Char, charArray: CharArray, startIndex: Int, size: Int): CharArray {
    var flag = false
    for (i in startIndex..size) {
//        println("bbb\t$i\t${charArray[i]}")
        if (charArray[i] == char) {
            charArray[i] = '0'
            flag = true
        }
    }
    if (flag) return charArray
    return charArrayOf()
}
