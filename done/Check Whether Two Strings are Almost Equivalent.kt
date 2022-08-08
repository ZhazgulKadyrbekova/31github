fun main() {
//    println(checkAlmostEquivalent("aaaa", "bccb"))
//    println(checkAlmostEquivalent("abcdeef", "abaaacc"))
//    println(checkAlmostEquivalent("cccddabba", "babababab"))
    println(checkAlmostEquivalent("cqvvnqjncrp", "hjtlyzvcbhj"))
}

fun checkAlmostEquivalent(word1: String, word2: String): Boolean {
    val map1: Map<String,Int> = word1.split("").filter { it.isNotEmpty() } .groupingBy { it }.eachCount()
    println(map1)
    val map2: Map<String,Int> = word2.split("").filter { it.isNotEmpty() } .groupingBy { it }.eachCount()
    println(map2)

    for (i in map1) {
        if (map2.containsKey(i.key) && Math.abs(map2[i.key]!! - map1[i.key]!!) <= 3) continue
        if (!map2.containsKey(i.key) && map1[i.key]!! <= 3) continue
        return false
    }
    for (i in map2) {
        if (map1.containsKey(i.key) && Math.abs(map2[i.key]!! - map1[i.key]!!) <= 3) continue
        if (!map1.containsKey(i.key) && map2[i.key]!! <= 3) continue
        return false
    }
    return true
}