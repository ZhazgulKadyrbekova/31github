fun main() {
//    println(wordPattern("abba", "dog cat cat dog"))
    println(wordPattern("abba", "dog dog dog dog"))
//    println(wordPattern("abba", "dog cat cat fish"))
//    println(wordPattern("aaaa", "dog cat cat dog"))

}

fun wordPattern(pattern: String, s: String): Boolean {
    val map = HashMap<Char, String>()
    val index = pattern.length - 1
    val array = s.split(" ")
    if (index + 1 != array.size) return false
    for (i in 0..index) {
        val char = pattern[i]
        println("$char\t->\t${array[i]}\t${map[char]}\t$map")
        if (map[char] != null) {
            if (map[char] != array[i]) {
                return false
            }
        } else if (map.containsValue(array[i])) {
            return false
        } else {
            map.put(char, array[i])
        }
    }
    return true
}