fun main() {
    val arr = allCellsDistOrder(2,2,0,1)
    for (i in arr) {
        for (j in i)
            print("$j\t")
        println()
    }
}

fun allCellsDistOrder(rows: Int, cols: Int, rCenter: Int, cCenter: Int): Array<IntArray> {
    val map = HashMap<Int, MutableList<IntArray>>()
    var i = 0; var j: Int
    while (i < rows) {
        j = 0
        while (j < cols) {
            val dist = Math.abs(i - rCenter) + Math.abs(j - cCenter)
            val resList = map[dist] ?: mutableListOf()
            resList.add(intArrayOf(i,j))
            map[dist] = resList
            j++
        }
        i++
    }

    val res = mutableListOf<IntArray>()
    for (arr in map.values)
        res.addAll(arr)

    return res.toTypedArray()
}