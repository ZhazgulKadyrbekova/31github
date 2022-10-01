fun main() {
    val arr = arrayOf(intArrayOf(1,2), intArrayOf(3,4))
    println(projectionArea(arr))
}

fun projectionArea(grid: Array<IntArray>): Int {
    var top = 0; var front = 0; var side = 0; var maxOfRow: Int; var maxOfColumn: Int
    var i = 0; var j: Int
    while (i < grid.size) {
        j = 0
        maxOfRow = 0
        maxOfColumn = 0
        while (j < grid[0].size) {
            if (grid[i][j] != 0) top++
            if (grid[i][j] > maxOfRow) maxOfRow = grid[i][j]
            if (grid[j][i] > maxOfColumn) maxOfColumn = grid[j][i]
            j++
        }
        front += maxOfRow
        side += maxOfColumn
        i++
    }
    return top + front + side
}
