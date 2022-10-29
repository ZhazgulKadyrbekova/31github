fun main() {
    val arr = numSmallerByFrequency(arrayOf("bbb","cc"), arrayOf("a","aa","aaa","aaaa"))
    for (i in arr)
        println(i)
}

fun numSmallerByFrequency(queries: Array<String>, words: Array<String>): IntArray {
    val wordsArr = mutableListOf<Int>()

    for (word in words) {
        val map = word.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount()
        var min = "z"; var value = 0
        for (entry in map.entries) {
            if (entry.key < min) {
                min = entry.key
                value = entry.value
            }
        }
        wordsArr.add(value)
    }
    wordsArr.sort()

    val res = IntArray(queries.size); var k = 0
    val size = wordsArr.size
    for (query in queries) {
//        println(query)
        val map = query.split("").filter { it.isNotBlank() }.groupingBy { it }.eachCount()
        var min = "{"; var value = 0
        for (entry in map.entries) {
            if (entry.key < min) {
                min = entry.key
                value = entry.value
            }
        }
//        println("$query\t$min\t$value")
        var i = 0; var isBroke = false
        while (i < size) {
            if (value < wordsArr[i]) {
//                println("-------$query\t$value\t$i\t$size\t$k\t$res")
                res[k++] = size - i
                isBroke = true
                break
            }
            i++
        }
        if (!isBroke)
            res[k++] = 0
    }

    return res
}