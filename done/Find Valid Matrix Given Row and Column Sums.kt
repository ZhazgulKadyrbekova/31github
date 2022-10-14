fun main() {
    val arr = restoreMatrix(intArrayOf(3,8), intArrayOf(4,7))
    for (i in arr) {
        for (j in i)
            print("$j\t")
        println()
    }
}

fun restoreMatrix(rowSum: IntArray, colSum: IntArray): Array<IntArray> {
    val res = Array(rowSum.size) { IntArray(colSum.size) }
    var i = 0; var j: Int
    while (i < rowSum.size) {
        j = 0
        while (j < colSum.size) {
            val min = if (rowSum[i] < colSum[j]) rowSum[i] else colSum[j]
            res[i][j] = min
            rowSum[i] -= min
            colSum[j] -= min
            j++
        }
        i++
    }
    return res
}