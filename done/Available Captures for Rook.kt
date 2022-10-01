fun main() {
    val arr = arrayOf(
        charArrayOf('.','.','.','.','.','.','.','.'),
        charArrayOf('.','.','.','p','.','.','.','.'),
        charArrayOf('.','.','.','R','.','.','.','p'),
        charArrayOf('.','.','.','.','.','.','.','.'),
        charArrayOf('.','.','.','.','.','.','.','.'),
        charArrayOf('.','.','.','p','.','.','.','.'),
        charArrayOf('.','.','.','.','.','.','.','.'),
        charArrayOf('.','.','.','.','.','.','.','.')
    )
    println(numRookCaptures(arr))
}

fun numRookCaptures(board: Array<CharArray>): Int {
    var rx = 0; var ry = 0; var i = 0
    while (i < board.size) {
        val value = board[i].indexOf('R')
        if (value != -1) {
            rx = i; ry = value
            break
        }
        i++
    }

    var count = 0
    i = rx
    while (i >= 0) {
        if (board[i][ry] == 'p') {
            count++
            break
        }
        if (board[i][ry] == 'B') {
            break
        }
        i--
    }
    i = rx
    while (i < board[0].size) {
        if (board[i][ry] == 'p') {
            count++
            break
        }
        if (board[i][ry] == 'B') {
            break
        }
        i++
    }
    i = ry
    while (i >= 0) {
        if (board[rx][i] == 'p') {
            count++
            break
        }
        if (board[rx][i] == 'B') {
            break
        }
        i--
    }
    i = ry
    while (i < board.size) {
        if (board[rx][i] == 'p') {
            count++
            break
        }
        if (board[rx][i] == 'B') {
            break
        }
        i++
    }

    return count
}