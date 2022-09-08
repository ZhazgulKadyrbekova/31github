fun main() {
    println(countVowelSubstrings("cuaieuouac"))
}

fun countVowelSubstrings(word: String): Int {
    val vowels = "aeiou"
    val size = word.length
    var count = 0
    var i = 0; var j: Int
    while (i < size) {
        val set = hashSetOf<Char>()
        j = i
        i++
        while (j < size) {
            if (!vowels.contains(word[j])) break
            set.add(word[j])
            if (set.size == 5) count++
            j++
        }
    }
    return count
}