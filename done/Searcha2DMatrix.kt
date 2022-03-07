fun main() {
    val arr = arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60))
    println(searchMatrix(arr, 13))
}

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    val row = matrix.size       //3
    val column = matrix[0].size //4

    var left = 0
    var right = row * column - 1

    while (left <= right) {
        val mid = left + (right - left) / 2
        val i = mid / column
        val j = mid % column
        if (matrix[i][j] == target) return true
        if (matrix[i][j] >= target) right = mid - 1
        else left = mid + 1
    }
    return false
}