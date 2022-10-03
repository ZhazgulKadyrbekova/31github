fun main() {
    val arr = matrixReshape(arrayOf(intArrayOf(1,2), intArrayOf(3,4)),1,4)
    for (i in arr)
        println(i)
}

fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    if (mat.size * mat[0].size != r * c) return mat
    val res = Array(r) { IntArray(c) }
    var x = 0; var y = 0
    for (i in mat) {
        for (j in i) {
            res[x][y] = j
            if (y == c - 1) {
                x++; y = 0
            } else {
                y++
            }
        }
    }
    return res
}