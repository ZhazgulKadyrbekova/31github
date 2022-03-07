fun main() {
    println(findTheDifference("abcd", "abcde"))
    println(findTheDifference("", "y"))
}

fun findTheDifference(s: String, t: String): Char {
    val sLen = s.length
    val tLen = t.length
    val sArr = s.toCharArray()
    val tArr = t.toCharArray()
    val sMap = hashMapOf<Char, Int>()
    val tMap = hashMapOf<Char, Int>()
    val maxLength = if (sLen > tLen) sLen else tLen
    for (i in 0..maxLength) {
        if (i < sLen) {
            if (sMap[sArr[i]] == null)
                sMap[sArr[i]] = 1
            else
                sMap[sArr[i]] = sMap[sArr[i]]!! + 1
        }
        if (i < tLen) {
            if (tMap[tArr[i]] == null)
                tMap[tArr[i]] = 1
            else
                tMap[tArr[i]] = tMap[tArr[i]]!! + 1
        }
    }

    val keys = if (sMap.size > tMap.size) sMap.keys else tMap.keys
    for (i in keys) {
        if (sMap[i] != tMap[i])
            return i
    }
    return '0'
}