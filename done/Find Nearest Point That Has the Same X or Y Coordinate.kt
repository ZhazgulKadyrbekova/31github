fun main() {
    val arr = arrayOf(intArrayOf(2,3))
    println(nearestValidPoint(3,4,arr))
}

fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {
    var min = Int.MAX_VALUE
    var imin = 0
    for (i in 0..(points.size - 1)) {
        val arr = points[i]
        if (x == arr[0] || y == arr[1]) {
            val manhattanDistance = Math.abs(x - arr[0]) + Math.abs(y - arr[1])
            if (manhattanDistance < min) {
                min = manhattanDistance
                imin = i
            }
        }
    }
    return if (min == Int.MAX_VALUE) -1 else imin
}