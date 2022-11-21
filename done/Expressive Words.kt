fun main() {
    println(expressiveWords("heeelllooo", arrayOf("hellllo")))
}

fun expressiveWords(s: String, words: Array<String>): Int {
    var count = 0
    for (word in words) {
        if (isExpressive(s, word))
            count++
    }
    return count
}
fun isExpressive(s: String, word: String): Boolean {
    var i = 0; var j = 0
    while (i < s.length && j < word.length) {
        if (s[i] == word[j]) {
            val len1 = getRepeatedLetterSize(s,i)
            val len2 = getRepeatedLetterSize(word,j)
            if (len1 < 3 && len1 != len2 || len1 >= 3 && len1 < len2)
                return false
            i += len1
            j += len2
        } else {
            return false
        }
    }
    return i == s.length && j == word.length
}
fun getRepeatedLetterSize(txt: String, index: Int): Int {
    var j = index
    while (j < txt.length && txt[j] == txt[index]) j++
    return j - index
}

fun expressiveWords1(s: String, words: Array<String>): Int {
    val map = s.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount()
    var count = 0
    for (word in words) {
        var isOk = true; var isBroke = false
        val temp = word.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount()
        if (map.size != temp.size || s.length < word.length) continue
        for (key in temp.keys) {
            if (map[key] == null) {
                isBroke = true; break
            }
            if (!(map[key] == temp[key] || map[key]!! > 2) || map[key]!! < temp[key]!!) {
                isOk = false; break
            }
        }
        if (isBroke) continue
        if (isOk) count++
    }
    return count
}