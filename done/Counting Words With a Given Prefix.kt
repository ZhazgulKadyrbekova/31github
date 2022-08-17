fun main() {
    println(prefixCount(arrayOf("pay","attention","practice","attend"), "at"))
}

fun prefixCount(words: Array<String>, pref: String): Int {
    return words.count { it.startsWith(pref) }
}