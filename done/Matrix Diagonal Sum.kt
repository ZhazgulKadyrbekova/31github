fun main() {
    val arr = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9))
    println(diagonalSum(arr))
}

fun diagonalSum(mat: Array<IntArray>): Int {
    var i = 0; var j = 0; var sum = 0; val size = mat.size
    while (i < size) {
        sum += mat[i][j]
        i++; j++
    }

    i = 0; j = size - 1
    while (i < size) {
        if (i != j)
            sum += mat[i][j]
        i++; j--
    }

    return sum
}