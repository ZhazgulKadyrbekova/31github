fun main() {
    println(finalValueAfterOperations(arrayOf("--X","X++","X++")))
    println(finalValueAfterOperations(arrayOf("++X","++X","X++")))
    println(finalValueAfterOperations(arrayOf("X++","++X","--X","X--")))
}

fun finalValueAfterOperations(operations: Array<String>): Int {
    var count = 0
    for (i in operations) {
        when (i) {
            "X++" -> count++
            "++X" -> count++
            "X--" -> count--
            "--X" -> count--
        }
    }
    return count
}