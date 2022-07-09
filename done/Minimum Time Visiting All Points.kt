fun main() {
//    val arr = arrayOf(intArrayOf(1,1), intArrayOf(3,4), intArrayOf(-1,0))
    val arr = arrayOf(intArrayOf(3,2), intArrayOf(-2,2))
    println(minTimeToVisitAllPoints(arr))
}

fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
    var res = 0
    val size = points.size - 1
    for (i in 1..size) {
        val arr = points[i]
        val prev = points[i-1]
        val max =   if (Math.abs(arr[0]-prev[0]) > Math.abs(arr[1]-prev[1])) Math.abs(arr[0]-prev[0])
                    else Math.abs(arr[1]-prev[1])
        res += max
    }
    return res
}