fun main() {
//    val arr = arrayOf(intArrayOf(3,7,8), intArrayOf(9,11,13), intArrayOf(15,16,17))
//    val arr = arrayOf(intArrayOf(1,10,4,2), intArrayOf(9,3,8,7), intArrayOf(15,16,17,12))
    val arr = arrayOf(intArrayOf(56216), intArrayOf(63251), intArrayOf(75772), intArrayOf(1945), intArrayOf(27014))
    val res = luckyNumbers(arr)
    println("****************************************************************")
    for (i in res)
        println(i)
}

fun luckyNumbers (matrix: Array<IntArray>): List<Int> {
    val rowSize = matrix.size; val colSize = matrix[0].size; var i = 0; var j: Int
    val res = mutableListOf<Int>()
    while (i < rowSize) {
        println("------------------------------------------------------------")
        j = 0
        while (j < colSize) {
            println()
            val value = matrix[i][j]
            println(value)
            if (minInRow(matrix, i) == value && maxInCol(matrix, j) == value) {
                res.add(value)
                break
            }
            else if (minInRow(matrix, i) == value) {
                break
            }
            j++
        }
        i++
    }
    return res
}
fun minInRow(matrix: Array<IntArray>, row: Int): Int {
    val size = matrix[0].size; var i = 0; var min = 100000
    while (i < size) {
        if (matrix[row][i] < min) min = matrix[row][i]
        i++
    }
    println(min)
    return min
}
fun maxInCol(matrix: Array<IntArray>, column: Int): Int {
    val size = matrix.size; var i = 0; var max = 1
    while (i < size) {
        if (matrix[i][column] > max) max = matrix[i][column]
        i++
    }
    println(max)
    return max
}