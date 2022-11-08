fun main() {
//    println(numSpecialEquivGroups(arrayOf("abcd","cdab","cbad","xyzz","zzxy","zzyx")))
    println(numSpecialEquivGroups(arrayOf("ababaa","aaabaa")))
}

fun numSpecialEquivGroups(words: Array<String>): Int {
    var count = 0
    val list: MutableList<List<Map<Char, Int>>> = mutableListOf()
    for (word in words) {
        val res = toMap(word)
        if (!list.contains(res)) count++
        list.add(res)
    }

    return count
}
fun toMap(word: String): List<Map<Char, Int>> {
    val fir = hashMapOf<Char, Int>()
    val sec = hashMapOf<Char, Int>()
    for (i in word.indices) {
        val key = word[i]
        if (i % 2 == 0) fir[key] = fir.getOrDefault(key, 1) + 1
        else sec[key] = sec.getOrDefault(key, 1) + 1
    }
    return listOf(fir,sec)
}
