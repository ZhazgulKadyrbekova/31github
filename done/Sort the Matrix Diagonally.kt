import java.util.*
import kotlin.collections.HashMap

fun main() {
    val rectangle = arrayOf(
        intArrayOf(3,3,1,1),
        intArrayOf(2,2,1,2),
        intArrayOf(1,1,1,2)
    )
    val arr = diagonalSort(rectangle)
    for (i in arr) {
        for (j in i)
            print("$j\t")
        println()
    }
}

fun diagonalSort(mat: Array<IntArray>): Array<IntArray> {
    val diagonals = HashMap<Int, PriorityQueue<Int>>()

    var i = 0; var j: Int
    while (i < mat.size) {
        j = 0
        while (j < mat[0].size) {
            val queue = diagonals.getOrDefault(i-j, PriorityQueue<Int>())
            queue.add(mat[i][j])
            diagonals[i-j] = queue
            j++
        }
        i++
    }

    i = 0
    while (i < mat.size) {
        j = 0
        while (j < mat[0].size) {
            mat[i][j] = diagonals[i-j]!!.poll()
            j++
        }
        i++
    }
    return mat
}