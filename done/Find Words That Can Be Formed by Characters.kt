fun main() {
    println(countCharacters(arrayOf("cat","bt","hat","tree"), "atach"))
}

fun countCharacters(words: Array<String>, chars: String): Int {
    val map: Map<String, Int> = chars.split("").filter { it.isNotEmpty() }.groupingBy { it }.eachCount()
    println(map)
    var count = 0
    for (word in words) {
        val tempMap = map.toMutableMap()
        var toCount = false
        for (char: Char in word) {
            val valByKey = tempMap[char.toString()]
            if (valByKey == null || valByKey <= 0) {
                toCount = false
                break
            }
            else {
                tempMap[char.toString()] = valByKey-1
                toCount = true
            }
        }
        if (toCount) count += word.length
    }
    return count
}