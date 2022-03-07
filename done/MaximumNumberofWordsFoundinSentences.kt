fun main() {
    println(mostWordsFound(arrayOf("alice and bob love leetcode", "i think so too", "this is great thanks very much")))
    println(mostWordsFound(arrayOf("please wait", "continue to fight", "continue to win")))
}

fun mostWordsFound(sentences: Array<String>): Int {
    var max = 0
    for (i in sentences) {
        val size = i.split(" ").size
        if (size > max)
            max = size
    }
    return max
}