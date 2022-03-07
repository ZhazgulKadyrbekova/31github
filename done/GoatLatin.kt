fun main() {
    println(toGoatLatin("I speak Goat Latin"))
}

fun toGoatLatin(sentence: String): String {
    val words: List<String> = sentence.split(' ')
    val res =  mutableListOf<String>()

    for (i in 0..(words.size-1)) {
        res.add(words[i])
        if (!isVowel(words[i][0])) {
            val firstChar = words[i][0]
            res[i] = res[i].removeRange(0,1).plus(firstChar)
        }
        res[i] += "ma"
        for (j in 0..i)
            res[i] += "a"
    }
    return res.joinToString(" ")
}

fun isVowel(char: Char): Boolean {
    val i = char.toInt()
    return (i == 65 || i == 97 || i == 69 || i == 101 || i == 73 || i == 105 || i == 79 || i == 111 || i == 85 || i == 117)
}