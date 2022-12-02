fun LRUCache(strArr: Array<String>): String {

    // code goes here
    val map = hashMapOf<String, Int>()
    var i = 0; val size = strArr.size
    while (i < size) {
        map[strArr[i]] = i
        i++
    }

    val array = Array<String>(size) { "-" }
    for (entry in map.entries) {
        array[entry.value] = entry.key
    }

    val sb = StringBuilder()
    var j = size - 1; var count = 0
    while (j >= 0) {
        if (array[j] != "-") {
            sb.insert(0, array[j])
            count++
        }

        if (count == 5 || count >= map.size) break
        else sb.insert(0, '-')
        j--
    }
    return sb.toString()

}

fun main() {
    println(LRUCache(arrayOf("A", "B", "A", "C", "A", "B")))
}
