fun main() {
    println(findShortestSubArray(intArrayOf(2,1,1,2,1,3,3,3,1,3,1,3,2)))
    println(findShortestSubArray(intArrayOf(2,2,1,1,1,4,3,2)))
}

fun findShortestSubArray(nums: IntArray): Int {
    val count = hashMapOf<Int, Int>()
    val first = hashMapOf<Int, Int>()
    val size = nums.size - 1
    var degree = 0
    var res = 0
    for (i in 0..size) {
        val key = nums[i]
        first.putIfAbsent(key, i)
        count[key] = count.getOrDefault(key, 0) + 1
        if (count[key]!! > degree) {
            degree = count[key]!!
            res = i - first[key]!! + 1
        } else if (count[key]!! == degree)
            res = Math.min(res, i - first[key]!! + 1);
        println("$key\t$degree\t$res\t$count\t$first")
    }
    return res
}
