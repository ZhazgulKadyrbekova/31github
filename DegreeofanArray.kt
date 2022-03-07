fun main() {
    println(findShortestSubArray(intArrayOf(1,2,2,3,1)))
//    println(findShortestSubArray(intArrayOf(1,2,2,3,1)))
//    println(findShortestSubArray(intArrayOf(1,2,2,3,1,4,2)))
}

fun findShortestSubArray(nums: IntArray): Int {
    val map = hashMapOf<Int, Int>()
    for (i in nums) {
        val value = map[i]
        if (value == null)
            map[i] = 1
        else
            map[i] = value + 1
    }
    return map.values.maxOrNull()!!
}
