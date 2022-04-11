fun main() {
    val arr = shiftGrid(arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9), intArrayOf(10,11,12)), 10)
    for (i in arr) {
        for (j in i)
            print("$j\t")
        println()
    }
    println()
}

fun shiftGrid(grid: Array<IntArray>, k: Int): List<List<Int>> {
    val list = mutableListOf<Int>()
    val y = grid.size
    val x = grid[0].size
    val t = x*y - k%(x*y)
    println("x:\t$x\ny:\t$y")

    val res = mutableListOf<MutableList<Int>>()
    var row = mutableListOf<Int>()
    var count = 0
    for (i in 0..(y-1)) {
        for (j in 0..(x-1)) {
            println("$i\t$j\t$count\t$row\t\t\t$res\t$list")
            count++
            if (count <= t) list.add(grid[i][j])
            else if (row.size != x) row.add(grid[i][j])
            else {
                res.add(row)
                row = mutableListOf()
                row.add(grid[i][j])
            }
        }
    }
    println("$list\t$count\t$row")
    for (i in list) {
        if (row.size != x) row.add(i)
        else {
            res.add(row)
            row = mutableListOf()
            row.add(i)
        }
    }
    res.add(row)
    return res
}