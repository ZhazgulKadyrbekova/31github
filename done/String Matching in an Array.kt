fun main() {
    val arr = stringMatching(arrayOf("mass","as","hero","superhero"))
//    val arr = stringMatching(arrayOf("leetcode","et","code"))
//    val arr = stringMatching(arrayOf("blue","green","bu"))
    for (i in arr)
        println(i)
}

fun stringMatching(words: Array<String>): List<String> {
    val res = mutableSetOf<String>()
    val size = words.size - 1
    for (i in 0..size) {
        for (j in 0..size) {
            if (i == j) continue
            if (words[i].contains(words[j])) res.add(words[j])
        }
    }
    return res.toList()
}