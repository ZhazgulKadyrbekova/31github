fun main() {
//    println(uniqueMorseRepresentations(arrayOf("gin","zen","gig","msg")))
    println(uniqueMorseRepresentations(arrayOf("a")))
}

fun uniqueMorseRepresentations(words: Array<String>): Int {
    val index = words.size - 1
    val set = mutableSetOf<String>()
    for (i in 0..index) {
//        println(words[i])
        val morse = getWordInMorse(words[i])
//        println(morse)
        set.add(morse)
    }
    return set.size
}
fun getWordInMorse(text: String): String {
    val morse = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
    val index = text.length - 1
    val stringBuilder = StringBuilder()
    for (i in 0..index) {
        val ind = text[i].toInt() - 97
        stringBuilder.append(morse[ind])
    }
    return stringBuilder.toString()
}