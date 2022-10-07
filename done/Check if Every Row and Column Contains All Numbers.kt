fun main() {
    println(checkValid(arrayOf(intArrayOf(1,2,3), intArrayOf(1,2,3),intArrayOf(1,2,3))))
}

fun checkValid(matrix: Array<IntArray>): Boolean {
    val size = matrix.size; var i = 0
    var rows = mutableSetOf<Int>(); var columns = mutableSetOf<Int>()
    while (i < size) {
        var j = 0
        while (j < size) {
            rows.add(matrix[i][j])
            j++
        }
        if (rows.size != size) return false

        j = 0
        while (j < size) {
            columns.add(matrix[j][i])
            j++
        }
        if (columns.size != size) return false

        rows = mutableSetOf(); columns = mutableSetOf()
        i++
    }
    return true
}