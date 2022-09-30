fun main() {
    val arr = arrayOf(intArrayOf(1,0,0), intArrayOf(0,0,1), intArrayOf(1,0,0))
    println(numSpecial(arr))
}

fun numSpecial(mat: Array<IntArray>): Int {
    var count = 0; var i = 0; var j: Int; val iSize = mat.size; val jSize = mat[0].size
    while (i < iSize) {
        j = 0
        while (j < jSize) {
            if (mat[i][j] == 1) {
                if (isSpecialPosition(mat, i, j)) count++
                break
            }
            j++
        }
        i++
    }
    return count
}
fun isSpecialPosition(mat: Array<IntArray>, row: Int, column: Int): Boolean {
    var i = 0
    while (i < mat.size) {
        if (i == row) {
            i++
            continue
        }
        if (mat[i][column] == 1) return false
        i++
    }

    i = 0
    while (i < mat[0].size) {
        if (i == column) {
            i++
            continue
        }
        if (mat[row][i] == 1) return false
        i++
    }

    return true
}