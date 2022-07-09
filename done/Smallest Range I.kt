fun main() {
    val arr = intArrayOf(0,10)
    println(smallestRangeI(arr, 2))
}

fun smallestRangeI(nums: IntArray, k: Int): Int {
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    for (i in nums) {
        if (i < min) min = i
        if (i > max) max = i
    }
    return if ((max - min) <= 2*k) 0
    else max - min - 2*k
}