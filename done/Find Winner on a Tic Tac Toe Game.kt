fun main() {
    println(tictactoe(arrayOf(intArrayOf(0,0), intArrayOf(2,0),intArrayOf(1,1),intArrayOf(2,1),intArrayOf(2,2))))
}

fun tictactoe(moves: Array<IntArray>): String {
    val aRow = IntArray(3); val aColumn = IntArray(3)
    var aD1 = 0; var aD2 = 0
    val bRow = IntArray(3); val bColumn = IntArray(3)
    var bD1 = 0; var bD2 = 0

    for (i in moves.indices) {
        val r = moves[i][0]; val c = moves[i][1]
        if (i % 2 == 0) {
            if (++aRow[r] == 3 || ++aColumn[c] == 3 || (r == c && ++aD1 == 3) || (r + c == 2 && ++aD2 == 3))
                return "A"
        } else {
            if (++bRow[r] == 3 || ++bColumn[c] == 3 || (r == c && ++bD1 == 3) || (r + c == 2 && ++bD2 == 3))
                return "B"
        }
    }
    return if (moves.size == 9) "Draw" else "Pending"
}
