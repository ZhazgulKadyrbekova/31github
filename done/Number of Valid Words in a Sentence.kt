fun main() {
    println(countValidWords("!this  1-s b8d!"))
    println(countValidWords("alice and  bob  are playing stone--game"))
    println(countValidWords("a-!"))
    println(countValidWords("a-!b"))
    println(countValidWords("!g 3 !sy "))
}

fun countValidWords(sentence: String): Int {
    val words = sentence.trim().split(" ")
    var count = 0
    for (word in words) {
        if (isValidWord(word)) count++
    }
    return count
}
fun isValidWord(word: String): Boolean {
    if (word.isEmpty()) return false
//    println(word)
    var i = 0; var hyphen = 0
    while (i < word.length) {
        val letter = word[i]

        if (Character.isDigit(letter)) {
            return false
        } else if (Character.isLowerCase(letter)) {
            i++; continue
        } else if (letter == '-') {
            if (++hyphen > 1) return false
            if (i - 1 < 0 || i + 1 >= word.length || !Character.isLowerCase(word[i-1])
                || !Character.isLowerCase(word[i+1])) return false
        } else if (i != word.length - 1) {
            return false
        }

        i++
    }
    return true
}