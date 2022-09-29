fun main() {
    val arr = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9))
    println(countNegatives(arr))
}

fun countNegatives(grid: Array<IntArray>): Int {
    var i = 0; var j: Int; var count = 0
    val iSize = grid.size; val jSize = grid[0].size
    while (i < iSize) {
        j = 0
        while (j < jSize) {
            if (grid[i][j] < 0) {
                count += (jSize - j)
                break
            }
            j++
        }
        i++
    }
    return count
}