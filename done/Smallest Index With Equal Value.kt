fun main() {
    val arr = intArrayOf(0,1,2)
    println(smallestEqual(arr))
}

fun smallestEqual(nums: IntArray): Int {
    val size = nums.size
    for (i in 0 until size) {
        if (i % 10 == nums[i]) return i
    }
    return -1
}