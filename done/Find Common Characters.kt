fun main() {
//    val arr = commonChars(arrayOf("bella","label","roller"))
    val arr = commonChars(arrayOf("cool","lock","cook"))
    for (i in arr)
        println(i)
}

fun commonChars(words: Array<String>): List<String> {
    val size = words.size
    var count: Int
    val res = mutableMapOf<String, Int>()
    for (char in words[0]) {
        count = 0
        for (j in 0 until size) {
            if (words[j].contains(char)) {
                count++
                words[j] = words[j].replaceFirst(char, ' ')
            }
        }
        if (count == size) {
            if (res[char.toString()] == null) res[char.toString()] = 1
            else res[char.toString()] = res[char.toString()]!! + 1
        }
    }
    println(res)
    val resList = mutableListOf<String>()
    for ((key, value) in res) {
        for (i in 1..value) {
            resList.add(key)
        }
    }
    return resList
}