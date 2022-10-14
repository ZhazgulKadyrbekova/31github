fun main() {
    val rectangle1 = arrayOf(
        intArrayOf(1,2,1),
        intArrayOf(4,3,4),
        intArrayOf(3,2,1)
    )
    val rectangle2 = arrayOf(
        intArrayOf(1,2,1),
        intArrayOf(4,3,2),
        intArrayOf(3,2,1)
    )
    println(findRotation(rectangle1, rectangle2))
}

fun findRotation(mat: Array<IntArray>, target: Array<IntArray>): Boolean {
    var i = 0; var j: Int; val size = mat.size
    var rotated = true

//    ----------------------------------------------------------------------------------------------------
    while (i < size) {
        j = 0
        while (j < size) {
            if (mat[i][j] != target[i][j]) {
                rotated = false
                i = size
                break
            }
            j++
        }
        i++
    }
    if (rotated) return true

    //    ----------------------------------------------------------------------------------------------------
    i = 0; rotated = true
    while (i < size) {
        j = 0
        while (j < size) {
            if (mat[i][j] != target[j][size - i - 1]) {
                rotated = false
                i = size
                break
            }
            j++
        }
        i++
    }
    if (rotated) return true

    //    ----------------------------------------------------------------------------------------------------
    i = 0; rotated = true
    while (i < size) {
        j = 0
        while (j < size) {
            if (mat[i][j] != target[size - i - 1][size - j - 1]) {
                rotated = false
                i = size
                break
            }
            j++
        }
        i++
    }
    if (rotated) return true

    //    ----------------------------------------------------------------------------------------------------
    i = 0; rotated = true
    while (i < size) {
        j = 0
        while (j < size) {
            if (mat[i][j] != target[size - j - 1][i]) {
                rotated = false
                i = size
                break
            }
            j++
        }
        i++
    }
    if (rotated) return true

    return false
}
