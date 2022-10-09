fun main() {
    val rectangle = arrayOf(
        intArrayOf(1, 2, 1),
        intArrayOf(4, 3, 4),
        intArrayOf(3, 2, 1)
    )
    println(maxIncreaseKeepingSkyline(rectangle))
}

fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
    val size = grid.size
    val rows = IntArray(size)
    val columns = IntArray(size)
    var maxRow: Int; var maxColumn: Int
    var i = 0; var j: Int
    while (i < size) {
        j = 0; maxRow = 0; maxColumn = 0
        while (j < size) {
            if (grid[i][j] > maxRow) maxRow = grid[i][j]
            if (grid[j][i] > maxColumn) maxColumn = grid[j][i]
            j++
        }
        rows[i] = maxRow
        columns[i] = maxColumn
        i++
    }
    /*
    println("rows:")
    for (k in rows) {
        print("$k\t")
    }
    println()
    println("columns:")
    for (k in columns) {
        print("$k\t")
    }
    println()
    */
    var count = 0; i = 0
    while (i < size) {
        j = 0
        while (j < size) {
            count += (Math.min(rows[i], columns[j]) - grid[i][j])
            j++
        }
        i++
    }
    return count
}