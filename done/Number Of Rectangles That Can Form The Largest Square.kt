fun main() {
//    val arr = arrayOf(intArrayOf(5,8), intArrayOf(3,9), intArrayOf(5,12), intArrayOf(16,5))
    val arr = arrayOf(intArrayOf(2,3), intArrayOf(3,7), intArrayOf(4,3), intArrayOf(3,7))
    println(countGoodRectangles(arr))
}

fun countGoodRectangles(rectangles: Array<IntArray>): Int {
    var maxLen = mutableMapOf<Int, Int>()
    for (arr in rectangles) {
        val min = if (arr[0] < arr[1]) arr[0] else arr[1]
        maxLen[min] = if (maxLen[min] == null) 1 else maxLen[min]!! + 1
    }
    maxLen = maxLen.toSortedMap()
    return maxLen.values.last()
}