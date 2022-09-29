fun main() {
    val arr = arrayOf(intArrayOf(1,2), intArrayOf(3,4))
    println(isToeplitzMatrix(arr))
}

fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
    var i = 1; var j: Int; val iSize = matrix.size; val jSize = matrix[0].size
    while (i < iSize) {
        j = 1
        while (j < jSize) {
            if (matrix[i][j] != matrix[i-1][j-1]) return false
            j++
        }
        i++
    }
    return true
}