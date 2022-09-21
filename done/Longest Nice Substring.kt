fun main() {
    println(longestNiceSubstring("Bb"))
}

fun longestNiceSubstring(s: String): String {
    val size = s.length
    var length = 2
    var i: Int; var max = 0; var res = ""
    while (length <= size) {
        i = 0
        while (i <= size - length) {
            val text = s.substring(i,i+length)
            if (isNice(text) && length > max) {
                max = length
                res = text
            }
            i++
        }
        length++
    }
    return res
}

fun isNice(text: String): Boolean {
    val letters = text.toCharArray()
    for (i in letters) {
        if (i in 'a'..'z' && !letters.contains(i - 32)) return false
        if (i in 'A'..'Z' && !letters.contains(i + 32)) return false
    }
    return true
}