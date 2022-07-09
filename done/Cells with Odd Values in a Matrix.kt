fun main() {
//    val arr = arrayOf(intArrayOf(1,1), intArrayOf(3,4), intArrayOf(-1,0))
    val arr = arrayOf(intArrayOf(1,1), intArrayOf(0,0))
    println(oddCells(2, 2, arr))
}

fun oddCells(m: Int, n: Int, indices: Array<IntArray>): Int {
    val matrix = Array(m) { IntArray(n) { 0 } }
    for (arr in indices) {
        for (j in 0 until m) {
            matrix[j][arr[1]] = matrix[j][arr[1]]+1
        }
        for (i in 0 until n) {
            matrix[arr[0]][i] = matrix[arr[0]][i]+1
        }
    }
    return getOddElements(matrix)
}

fun getOddElements(matrix: Array<IntArray>): Int {
    var count = 0
    for (arr in matrix) {
        for (i in arr)
            if (i % 2 == 1) count++
    }
    return count
}