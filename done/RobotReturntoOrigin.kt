fun main() {
    println(judgeCircle("UD"))
    println(judgeCircle("LL"))
}

fun judgeCircle(moves: String): Boolean {
    val size = moves.length - 1
    var x = 0
    var y = 0

    for (i in 0..size)
        when (moves[i]) {
            'U' -> y++
            'D' -> y--
            'L' -> x--
            'R' -> x++
        }

    return (x == 0 && y == 0)
}