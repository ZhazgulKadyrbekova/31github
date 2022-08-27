fun main() {
//    println(canBeTypedWords("hello world","ad"))
    println(canBeTypedWords("leet code","lt"))
}

fun canBeTypedWords(text: String, brokenLetters: String): Int {
    var count = 0
    for (word in text.split(" ")) {
        var contains = false
        for (char in brokenLetters) {
            if (word.contains(char)) {
                contains = true
                break
            }
        }
        if (!contains) count++
    }
    return count
}