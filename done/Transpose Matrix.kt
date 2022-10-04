fun main() {
    val arr = transpose(arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9)))
    for (i in arr) {
        for (j in i)
            print("$j\t")
        println()
    }
}

fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    val m = matrix[0].size; val n = matrix.size
    val res = Array(m) { IntArray(n) }
    var i = 0; var j = 0
    while (i < m) {
        j = 0
        val intArray = IntArray(n)
        while (j < n) {
            intArray[j] = matrix[j][i]
            j++
        }
        res[i] = intArray
        i++
    }
    return res
}