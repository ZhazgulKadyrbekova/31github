fun CountingAnagrams(str: String): String {

    // code goes here
    val set = str.split(" ").toSet()
    println(set)
    val map = hashMapOf<String,Int>()
    map["-"] = 0

    for (word in set) {
        var shouldAddKey = true
        for (key in map.keys) {
            if (isAnagram(word, key)) {
                map[key] = map[key]!! + 1
                shouldAddKey = false
                break
            }
        }
        if (shouldAddKey) map[word] = 0
    }
    println(map)

    var sum = 0
    for (i in map.values)
        sum += i

    return sum.toString();

}
fun isAnagram(word1: String, word2: String): Boolean {
    val fir = word1.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount()
    val sec = word2.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount()
    return fir == sec
}

fun main() {
    println(CountingAnagrams("aa aa odg dog gdo"))
    println(CountingAnagrams("aa car arc odg dog gdo"))
}
